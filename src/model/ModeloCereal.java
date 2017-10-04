package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloCereal {
    
    private final String archivoCorn = "votos/votos_cornflakes.txt";
    private final String archivoChoco = "votos/votos_chocokrispies.txt";
    private final String archivoZuca = "votos/votos_zucaritas.txt";
    private int votosCorn;
    private int votosChoco;
    private int votosZuca;
    
    public ModeloCereal() {
        
        this.votosCorn = 0;
        this.votosChoco = 0;
        this.votosZuca = 0;
        
    }
    
    public void votoCorn() {
        this.votosCorn++;
        guardaVoto(archivoCorn);
    }
    
    public void votoChoco() {
        this.votosChoco++;
        guardaVoto(archivoChoco);
    }
    
    public void votoZuca() {
        this.votosZuca++;
        guardaVoto(archivoZuca);
    }

    public int getVotosCorn() {
        return votosCorn;
    }

    public int getVotosChoco() {
        return votosChoco;
    }

    public int getVotosZuca() {
        return votosZuca;
    }
    
    private void guardaVoto(String archivo) {
        
        ManejadorArchivos manejadorArchivo = new ManejadorArchivos();    
        DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fechaHoraActual = new Date();
        
        manejadorArchivo.escribirArchivo(archivo, formatoFecha.format(fechaHoraActual));
        
    }
}
