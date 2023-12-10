
import log.CSVLog;
import log.ILog;
import log.JsonLog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nitro5WIN10
 */
public class LogService {
    private ILog metodoLog;
    private String paramLog;

    public LogService(String paramLog) {
        metodoLog = getLogFactory();
    }
    
    private ILog getLogFactory(){  
        try{
            Class<?> classeProp = Class.forName(paramLog);
            Object instanciaLog = classeProp.getDeclaredConstructor().newInstance();
            return (ILog)instanciaLog;
        }catch(Exception e) {
            throw new RuntimeException("Erro: LOG não suportado! \n" + e.getMessage());
        }
    }
    
    public void addLog(String mensagem){
        metodoLog.addLog(mensagem);
    }

}
