package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Bitacora;
import model.ModeloCereal;
import view.VistaCereal;

public class ControladorCereal implements ActionListener {

    private final String NOMBRE_CLASE = "ControladorCereal";
    private final Bitacora bitacora;
    private final ModeloCereal modelo;
    private final VistaCereal vista;
    
    public ControladorCereal(ModeloCereal modelo, VistaCereal vista) {
        
        bitacora = new Bitacora();
        bitacora.guardarRegistro("ControladorCereal()", NOMBRE_CLASE);
        
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.getButtonCerealA().addActionListener(this);
        this.vista.getButtonCerealB().addActionListener(this);
        this.vista.getButtonCerealC().addActionListener(this);
        
    }
    
    public void iniciarVista() {
        
        bitacora.guardarRegistro("iniciarVista()", NOMBRE_CLASE);
        vista.setTitle("Votación Cereales");
        vista.pack();
        vista.setDefaultCloseOperation(vista.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);  
        vista.actualizarCereales(
                modelo.getCerealA(),
                modelo.getCerealB(),
                modelo.getCerealC(),
                modelo.getVotosCerealA(), 
                modelo.getVotosCerealB(), 
                modelo.getVotosCerealC());
        
    }
        
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        bitacora.guardarRegistro("actionPerformed(ActionEvent evento)", NOMBRE_CLASE);
        
        Object botonPresionado = evento.getSource();
        
        if (botonPresionado == vista.getButtonCerealA()) {
            bitacora.guardarRegistro("\tClicked cereal A button", NOMBRE_CLASE);
            modelo.votoCerealA();
            vista.actualizarVotosA(modelo.getVotosCerealA());
        }
        else if (botonPresionado == vista.getButtonCerealB()) {
            bitacora.guardarRegistro("\tClicked cereal B button", NOMBRE_CLASE);
            modelo.votoCerealB();
            vista.actualizarVotosB(modelo.getVotosCerealB());
        }
        else if (botonPresionado == vista.getButtonCerealC()) {
            bitacora.guardarRegistro("\tClicked cereal C button", NOMBRE_CLASE);
            modelo.votoCerealC();
            vista.actualizarVotosC(modelo.getVotosCerealC());
        }
        else {
            System.out.println("Error al contabilizar el voto.");
        }
        
    }
    
}
