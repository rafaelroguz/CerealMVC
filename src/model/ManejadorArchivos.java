package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ManejadorArchivos {
    
    public void escribirArchivo(String archivo, String lineaTexto) {
        
        try{
            
            PrintWriter fileOut = new PrintWriter(archivo);
            
            fileOut.println(lineaTexto);
            fileOut.close();
            
        } catch (FileNotFoundException e){
            
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
            }
            
            fileIn.close();
            
        } catch(FileNotFoundException e) {
            
            System.out.println("Error de lectura del archivo \"" + archivo + "\".");
            e.printStackTrace();
            
        }
        
        return numeroVotos;
        
    }
    
}
