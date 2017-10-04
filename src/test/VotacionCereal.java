package test;

import controller.ControladorCereal;
import model.ModeloCereal;
import view.VistaCereal;

public class VotacionCereal {
    
    public static void main(String[] args) {
        
        ModeloCereal modelo = new ModeloCereal();
        VistaCereal vista = new VistaCereal();
        ControladorCereal controlador = new ControladorCereal(modelo, vista);
        
        controlador.iniciarVista();
        
    }
    
}
