//
//import log.CSVLog;
//import log.ILog;
//import log.JsonLog;
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author nitro5WIN10
// */
//public class LogService {
//    private ILog metodoLog;
//    private String paramLog;
//
//    public LogService(String paramLog) {
//        metodoLog = getLogFactory();
//    }
//    
//    private ILog getLogFactory(){  
//        try{
//            System.out.println("CHAMADO");
//            Class<?> classeProp = Class.forName(paramLog);
//            Object instanciaLog = classeProp.getDeclaredConstructor().newInstance();
//            return (ILog)instanciaLog;
//        }catch(Exception e) {
//            throw new RuntimeException("Erro: LOG não suportado! \n" + e.getMessage());
//        }
//    }
//    
//    public void addLog(String mensagem){
//        metodoLog.addLog(mensagem);
//    }
//
//}
////<!--<?xml version="1.0" encoding="UTF-8"?>
////<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
////         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
////    <modelVersion>4.0.0</modelVersion>
////    <groupId>com.mycompany</groupId>
////    <artifactId>LogTrabalhoFinalPSS</artifactId>
////    <version>1.0-SNAPSHOT</version>
////    <packaging>jar</packaging>
////    <properties>
////        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
////        <maven.compiler.source>17</maven.compiler.source>
////        <maven.compiler.target>17</maven.compiler.target>
////        <exec.mainClass>com.mycompany.logtrabalhofinalpss.LogTrabalhoFinalPSS</exec.mainClass>
////    </properties>
////
////    <dependencies>
////        <dependency>
////            <groupId>org.json</groupId>
////            <artifactId>json</artifactId>
////            <version>20210307</version>
////        </dependency>
////    </dependencies>
////
////    <build>
////        <plugins>
////            <plugin>
////                <groupId>org.apache.maven.plugins</groupId>
////                <artifactId>maven-compiler-plugin</artifactId>
////                <version>3.10.0</version>  Use uma versão mais recente do plugin 
////                <configuration>
////                    <release>17</release>
////                </configuration>
////            </plugin>
////        </plugins>
////    </build>
////</project>-->
//
