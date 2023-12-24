package GUI.JOptionPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               o informs them of something.

        //JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Your computer has a virus!!", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!", "title", JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println("Hello " + name);

        String[] responses = {"No, you're awesome!", "Thank you!", "*blush*"};

        ImageIcon image = new ImageIcon("hi-zorua.png");
        Image imageSize = image.getImage();
        Image newImg = imageSize.getScaledInstance(30,30, Image.SCALE_SMOOTH); // scale it the smooth way
        image = new ImageIcon(newImg); // transform it back

        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "Secret Message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                image,
                responses,
                0);
    }
}
