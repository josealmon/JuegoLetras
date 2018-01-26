
package juegoletras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements KeyListener,ActionListener{
    
    private Vista v;
    
    public Controlador(){
        v=new Vista(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("derecha");
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("izquierda");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        v.generarLetras();
        v.repaint();
    }

    
}
