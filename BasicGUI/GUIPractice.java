package GUI.BasicGUI;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;

public class GUIPractice {
    public static void main(String[] args){
        ImageIcon icon = new ImageIcon("C:\\Users\\aluza\\Downloads\\cof.png");
        Image imageSize = icon.getImage();
        Image newImg = imageSize.getScaledInstance(35,35, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);


        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        JOptionPane.showMessageDialog(null, "You've been working too hard");
        JOptionPane.showMessageDialog(null, "Keep it up!");

        String[] options = { "rock", "paper", "scissors" };
        var selection = JOptionPane.showOptionDialog(null, "Select one:", "Let's play a game!", 0, 3, icon , options, options[0]);

        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "You chose rock!");
        }
        if (selection == 1) {
            JOptionPane.showMessageDialog(null, "You chose paper.");
        }
        if (selection == 2) {
            JOptionPane.showMessageDialog(null, "You chose scissors!");
        }
    }
}
