package main;

import views.MainFrame;


public class NewMain {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
                mf.setResizable(false);
                mf.setLocationRelativeTo(null);
            }
        });
    }
    
}
