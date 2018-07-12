import javax.swing.*;
import java.awt.*;

public class GridLayoutManager
{
    public static void main(String[] args) {
        JFrame frm = new JFrame("BorderLayout");
        frm.setBounds(120,120,300,100);
        frm.setLayout(new GridLayout(3,2,2,2));

        frm.add(new JButton("EAST"));
        frm.add(new JButton("WEST"));
        frm.add(new JButton("SOUTH"));
        frm.add(new JButton("NORTH"));
        frm.add(new JButton("CENTER"));
        frm.add(new JButton("der"));

        frm.setVisible(true);
    }
}
