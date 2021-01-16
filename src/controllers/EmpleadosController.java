package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.*;
import views.*;

public class EmpleadosController implements ActionListener {
    
    MainFrame frame;
    RegistrarEmpleado empleadoJInternal;
    Empleado empleado;
    
    public EmpleadosController(RegistrarEmpleado empleadoJInternal){
        this.empleadoJInternal = empleadoJInternal;    
        empleado = new Empleado();
    }
    
    public EmpleadosController(MainFrame frame) {
        this.frame = frame;
        empleadoJInternal = new RegistrarEmpleado();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object ev = e.getSource();
        
        if(ev == frame.getMenuRegistrar()){
            if(!FrameMain.formularioActivo("Registro Empleado", frame)){
            frame.getDesktopPane().add(empleadoJInternal);
            empleadoJInternal.setVisible(true);
            FrameMain.formularioCentrado(empleadoJInternal, frame);
            }
        }
    
        if(ev == empleadoJInternal.getBtnGuardarEmpleado()){
            empleadoJInternal.guardarEmpleado(empleado);
        }
    }
    
}
