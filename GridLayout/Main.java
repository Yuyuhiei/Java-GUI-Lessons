package GUI.GridLayout;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args){

        // Layout Manager - Defines the natural layout for components within a container

        // GridLayout = places components in a grid of cells.
        //              Each component takes all the available space within its cell
        //              and each cell is the same size

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(9,4,10,10));


        for (String s : Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40")) {
            frame.add(new JButton(s));
        }

        frame.setVisible(true);

    }
}
