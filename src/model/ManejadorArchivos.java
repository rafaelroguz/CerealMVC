package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ManejadorArchivos {
    
    public void escribirArchivo(String archivo, String lineaTexto) {
        
        try{
        
            final Path rutaArchivo = Paths.get(archivo); 
            
            if (Files.notExists(rutaArchivo)) {
                Files.createFile(rutaArchivo);
            } 
                
            Files.write(Paths.get(archivo), lineaTexto.getBytes(), StandardOpenOption.APPEND);           
            
        } catch (IOException e) {
            
            System.out.println("Error de escritura del archivo \"" + archivo + "\".");
            e.printStackTrace();
            
        }
        
    }
    
    public int leerArchivo(String archivo) {
        
        int numeroVotos = 0;
        
        try{
            
            Scanner fileIn = new Scanner(new FileReader(archivo));
            
            while (fileIn.hasNextLine()){
                
                numeroVotos++;
                fileIn.nextLine();
                
            }
            
            fileIn.close();
            
        } catch(FileNotFoundException e) {
            
            System.out.println("Error de lectura del archivo \"" + archivo + "\".");
            e.printStackTrace();
            
            return 0;
            
        }
        
        return numeroVotos;
        
    }
    
}
