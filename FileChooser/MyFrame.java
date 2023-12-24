package GUI.FileChooser;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showOpenDialog(null); // select file to open

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

            /* fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

            System.out.println(fileChooser.getSelectedFile());
            System.out.println(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(fileChooser.getSelectedFile().getName());
            System.out.println(fileChooser.getSelectedFile().getParent());
            System.out.println(fileChooser.getSelectedFile().getParentFile());
            System.out.println(fileChooser.getSelectedFile().getParentFile().getAbsolutePath());
            System.out.println(fileChooser.getSelectedFile().getParentFile().getName());
            System.out.println(fileChooser.getSelectedFile().getParentFile().getParent());
            System.out.println(fileChooser.getSelectedFile().getParentFile().getParentFile());
            System.out.println(fileChooser.getSelectedFile().getParentFile().getParentFile().getAbsolutePath());
            System.out. */

        }

    }
}
