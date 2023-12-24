package GUI.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(420,420);
            this.setLayout(new FlowLayout());


            menuBar = new JMenuBar();
            fileMenu = new JMenu("File");
            editMenu = new JMenu("Edit");
            helpMenu = new JMenu("Help");

            loadItem = new JMenuItem("Load");
            saveItem = new JMenuItem("Save");
            exitItem = new JMenuItem("Exit");


            fileMenu.add(loadItem);
            fileMenu.add(saveItem);
            fileMenu.add(exitItem);

            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(helpMenu);

            loadItem.addActionListener(this);
            saveItem.addActionListener(this);
            exitItem.addActionListener(this);

            fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file
            editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
            helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help
            loadItem.setMnemonic(KeyEvent.VK_L); // l for load
            saveItem.setMnemonic(KeyEvent.VK_S); // s for load
            exitItem.setMnemonic(KeyEvent.VK_E); // e for exit


            this.setJMenuBar(menuBar);
            this.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("Loaded a file");
        }
        if(e.getSource()==saveItem){
            System.out.println("Saved a file");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
