
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nitro5WIN10
 */


public class CSVLog implements ILog {
    private static CSVLog instancia;
    private String arquivoCSV;

    private CSVLog() {
        arquivoCSV = "logs.csv";
        criaArquivo();
    }

    public static CSVLog getInstancia() {
        if (instancia == null)
            instancia = new CSVLog();

        return instancia;
    }

    public void addLog(String mensagem) {
        salvarLog(mensagem);
        lerArquivo();
    }

    private void criaArquivo() {
        try {
            File arquivo = new File(arquivoCSV);
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCSV, true))) {
                    writer.write("Log;\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarLog(String mensagem) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCSV, true))) {
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void lerArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Faça algo com cada linha lida, se necessário
                System.out.println( "\nlog:" + linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}