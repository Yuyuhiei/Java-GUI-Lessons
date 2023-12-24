package GUI.JButton;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon image = new ImageIcon("hi-zorua.png");
        Image imageSize = image.getImage();
        Image newImg = imageSize.getScaledInstance(30,30, Image.SCALE_SMOOTH); // scale it the smooth way
        image = new ImageIcon(newImg); // transform it back

        ImageIcon image2 = new ImageIcon("hi-zorua.png");
        Image imageSize2 = image2.getImage();
        Image newImg2 = imageSize2.getScaledInstance(30,30, Image.SCALE_SMOOTH); // scale it the smooth way
        image2 = new ImageIcon(newImg2); // transform it back

        label = new JLabel();
        label.setIcon(image2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 50);
        button.addActionListener(this); // (e -> System.out.println("poo")); - Lambda Expression
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 12));
        button.setIconTextGap(1);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}

