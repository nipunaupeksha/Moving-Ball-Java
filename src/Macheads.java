
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nipuna
 */
public class Macheads {
    public static void main(String args[]){
    Second s =new Second();
        JFrame f =new JFrame();
        f.add(s);
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Moving Ball");
    }
}
