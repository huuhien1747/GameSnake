/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackages.Graphics;

import javax.swing.JFrame;

/**
 *
 * @author Huu Hien
 */
public class GameWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        GameScreen playzone = new GameScreen();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);
        frame.add(playzone);
        frame.setVisible(true);
        
    }
}
