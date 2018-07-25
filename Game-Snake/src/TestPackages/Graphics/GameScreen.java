/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackages.Graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Huu Hien
 */
public class GameScreen extends JPanel implements Runnable{
    
    public GameScreen(){
        Thread thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void paint(Graphics g){
        g.drawOval(20, 20, 20, 30);
    }

    @Override
    public void run() {
        int i= 0;
        do{
        i++;
        System.out.println(i);
        }while(true);
    }
}
