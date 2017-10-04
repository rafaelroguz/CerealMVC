package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModeloCereal;
import view.VistaCereal;

public class ControladorCereal implements ActionListener {

    private ModeloCereal modelo;
    private VistaCereal vista;
    
    public ControladorCereal(ModeloCereal modelo, VistaCereal vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.getButtonCorn().addActionListener(this);
        this.vista.getButtonChoco().addActionListener(this);
        this.vista.getButtonZuca().addActionListener(this);
        
    }
    
    public void iniciarVista() {
        
        vista.setTitle("Cereales");
        vista.pack();
        vista.setDefaultCloseOperation(vista.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);  
        
    }
        
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        Object botonPresionado = evento.getSource();
        
        if (botonPresionado == vista.getButtonCorn()) {
            modelo.votoCorn();
        }
        else if (botonPresionado == vista.getButtonChoco()) {
            modelo.votoChoco();
        }
        else if (botonPresionado == vista.getButtonZuca()) {
            modelo.votoZuca();
        }
        else {
            System.out.println("Error al contabilizar el voto.");
        }
        
        vista.actualizar(modelo.getVotosCorn(), modelo.getVotosChoco(), modelo.getVotosZuca());
        
    }
    
    
    
}
