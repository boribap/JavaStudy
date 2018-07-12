import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseEventHandler1 implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 버튼 눌렸다가 풀림");
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}
}

public class JButtonMouseEvent
{
    public static void main(String[] args) {
        JFrame frm = new JFrame("JButton Disable");
        frm.setBounds(120,120,400,100);
        frm.setLayout(new FlowLayout());

        JButton btn1 = new JButton("My button");
        MouseListener listener = new MouseEventHandler1();
        btn1.addMouseListener(listener);

        JButton btn2 = new JButton("Yout button");
        btn2.addMouseListener(listener);

        frm.add(btn1);
        frm.add(btn2);
        btn1.setEnabled(false);

        frm.setVisible(true);
    }
}
