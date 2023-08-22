/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompras;

import javax.swing.JFrame;
import lista.view.Jflistacompras;

/**
 *
 * @author 182210126
 */
public class Listacompras extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jflistacompras r = new Jflistacompras();
        r.setVisible(true);
        r.setSize(400,400);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
