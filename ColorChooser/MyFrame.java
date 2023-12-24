package GUI.ColorChooser;

import javax.swing.*;
import javax.swing.JColorChooser;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton changeButton;
    JLabel label;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //button settings
        changeButton = new JButton("Change color");
        changeButton.addActionListener(this);

        //label settings
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        //addition of settings to this frame
        this.add(changeButton);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == changeButton) {
            Object[] choices = {"Foreground", "Background"};
            JComboBox comboBox = new JComboBox(choices);
            comboBox.addActionListener(this);
            int response = JOptionPane.showConfirmDialog(this, comboBox, "Choose what will you change", JOptionPane.OK_CANCEL_OPTION);


            this.add(comboBox);

            if (response == 0) {
                String selectedItem = (String) comboBox.getSelectedItem();

                if (selectedItem.equals("Foreground")) {
                    JColorChooser colorChooser = new JColorChooser();
                    Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
                    label.setForeground(color);

                } else if (selectedItem.equals("Background")) {
                    JColorChooser colorChooser = new JColorChooser();
                    Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
                    label.setBackground(color);
                }

            }
            else
                JOptionPane.showMessageDialog(null, "Aborted");

        /*if(e.getSource() == ForegroundButton){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);

            label.setForeground(color);
        } */

        /*System.out.println("You clicked me!");
        System.out.println(e.getActionCommand());
        System.out.println(e.getSource());
        System.out.println(e.getWhen());
        System.out.println(e.getModifiers());
        System.out.println(e.getClickCount());
        System.out.println(e.getKeyCode());
        System.out.println(e.getKeyChar());
        System.out.println(e.getExtendedKeyCode());
        System.out.println(e.getModifiersEx());
        System.out.println(e.getOldValue());
        System.out.println(e.getNewValue());
        System.out.println(e.getSource());
        System.out.println(e.getID());
        System.out.println(e.getChangeValue());
        System */

            }
        }
    }


