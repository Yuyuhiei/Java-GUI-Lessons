package GUI.TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("submit");
        button.addActionListener(this);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(400,40));
        textField.setFont(new Font("Consolas", Font.BOLD, 21));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(new Color(0,0,0));
        textField.setCaretColor(Color.white);
        //textField.setText("Username");
        //textField.setEditable(false);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Welcome " + textField.getText());
            //button.setEnabled(false);
            //textField.setEditable(false);

        }

    }
}
