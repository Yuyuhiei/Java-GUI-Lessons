package GUI.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        // JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("hi-zorua.png");
        Image imageSize = image.getImage();
        Image newImg = imageSize.getScaledInstance(300,300, Image.SCALE_SMOOTH); // scale it the smooth way
        image = new ImageIcon(newImg); // transform it back

        Border border = BorderFactory.createLineBorder(Color.red,2);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, ENTER, OR RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(Color.red); // set font color of text
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); // set font of text
        label.setIconTextGap(0); // set gap of text to image
        label.setBackground(Color.black); //set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        //label.setBounds(100,100,350,350); // set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
