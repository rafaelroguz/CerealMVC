package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModeloCereal {
    
    private final String archivoCorn = "votos_cornflakes.txt";
    private final String archivoChoco = "votos_chocokrispies.txt";
    private final String archivoZuca = "votos_zucaritas.txt";
    private int votosCorn;
    private int votosChoco;
    private int votosZuca;
    
    public ModeloCereal() {
        
        this.votosCorn = leerVotos(archivoCorn);
        this.votosChoco = leerVotos(archivoChoco);
        this.votosZuca = leerVotos(archivoZuca);
        
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
        String lineaTexto = formatoFecha.format(fechaHoraActual) + "\n";
        
        manejadorArchivo.escribirArchivo(archivo, lineaTexto);
        
    }
    
    private int leerVotos(String archivo) {
        
        ManejadorArchivos manejadorArchivo = new ManejadorArchivos(); 
        
        return manejadorArchivo.leerArchivo(archivo);
        
    }
    
}
