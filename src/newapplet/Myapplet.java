/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newapplet;

import javax.swing.JApplet;
import java.awt.*;
/**
 *
 * @author Asus
 */
public class Myapplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
       super.paint(g);
       
       g.drawString("Hello World!", 20, 40); 
    }
}
