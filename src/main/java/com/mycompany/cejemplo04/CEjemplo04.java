package com.mycompany.cejemplo04;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;  // Look and Feel de JTattoo
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Vista.CIngreso;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import javax.swing.plaf.metal.MetalLookAndFeel;


public class CEjemplo04 {

    public static void main(String[] args) {
        try {
            // Establecer el Look and Feel McWin de JTattoo
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        // Ejecutar el formulario inicial (CIngreso) en el hilo de eventos de Swing
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIngreso().setVisible(true);  // Muestra la ventana inicial
            }
        });
    }
}
