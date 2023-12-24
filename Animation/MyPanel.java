package GUI.Animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image zorua;
    Image backgroundImage;
    Image originalImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);

        zorua = new ImageIcon("textHev.png").getImage();
        Image imageSize = zorua;
        Image resize = imageSize.getScaledInstance(120,120, Image.SCALE_SMOOTH);
        zorua = new ImageIcon(resize).getImage();

        originalImage = new ImageIcon("alamMoBaGirl.jpg").getImage();
        backgroundImage = originalImage.getScaledInstance(650, PANEL_HEIGHT, Image.SCALE_DEFAULT);

        timer = new Timer(7, this);
        timer.start();

    }

    public void paint(Graphics g){
        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;

        // g2D.drawImage(backgroundImage, 0, 0, null);
        g.drawImage(backgroundImage, 0, 0, this);
        g2D.drawImage(zorua, x, y, null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-zorua.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
         x = x + xVelocity;
        if(y >= PANEL_HEIGHT-zorua.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
         repaint();

    }
}
