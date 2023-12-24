package GUI.BasicGUI;

import javax.swing.*;

public class Nineteenth {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String[] options = { "ay weh", "bomb Israel" };
        var selection = JOptionPane.showOptionDialog(null, "Happy Birthday, "+name, "It's your birthday today", 0, 1, null , options, options[0]);

        if (selection == 0) {
            JOptionPane.showMessageDialog(null, "gegege");
        }
        if (selection == 1) {
            JOptionPane.showMessageDialog(null, "BAI NA BAI");
        }
    }
}
