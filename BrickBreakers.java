package com.mycompany.brickbreakers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//import com.mycompany.brickbreakers.GamePlay;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.*;
//import java.io.IOException;
//package com.mycompany.brickbreakers;

/**
 *
 * @author ADMIN
 */
public class BrickBreakers {

    public static void main(String[] args) throws IOException {
       JFrame jframe = new JFrame(); //new JFrame object
        GamePlay gp = new GamePlay(); //new GamePlay object

        jframe.setBounds(10,10,700,600); //setting the x,y,height and width of the frame
        
        jframe.setResizable(false); //user should not be able to resize
        jframe.setTitle("Best Brick Breaker Game"); //setting the title
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting the default close operation
        jframe.setVisible(true); //make the frame visible
        jframe.add(gp); //add a gameplay object(component)
    }
}
