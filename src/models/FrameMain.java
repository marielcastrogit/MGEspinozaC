package models;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import views.MainFrame;

public class FrameMain {
    
    public static boolean formularioActivo(String formularioInterno, MainFrame frame){
        
        JInternalFrame[] formularioActivo = frame.getDesktopPane().getAllFrames();
        
        if(formularioActivo.length>=1){
            for(int i = 0; i< formularioActivo.length;i++){
                if(formularioActivo[i].getTitle().equalsIgnoreCase(formularioInterno)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void formularioCentrado(JInternalFrame formulario, MainFrame frame){
        Dimension  tamañoEscritorio = frame.getDesktopPane().getSize();
        Dimension tamañoFormulario = formulario.getSize();
        
        formulario.setLocation((tamañoEscritorio.width - tamañoFormulario.width)/2, (tamañoEscritorio.height - tamañoFormulario.height)/2);
    }
    
        
}
