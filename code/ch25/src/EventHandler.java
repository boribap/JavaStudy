import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseEventHandler implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e) {
        JButton button = (JButton)e.getComponent();
        button.setText("Clicked");
        System.out.println("Clicked Button" + e.getButton());
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

class MyJFrame extends JFrame implements MouseListener
{
    public MyJFrame(String name)
    {
        super(name);
        setBounds(120,120,400,100);
        setLayout(new FlowLayout());
        addMouseListener(this);

        JButton btn1 = new JButton("My button");
        MouseListener listener = new MouseEventHandler();
        btn1.addMouseListener(listener);

        JButton btn2 = new JButton("Yout button");
        btn2.addMouseListener(listener);

        JButton btn3 = new JButton("our button");
        btn3.addMouseListener(listener);

        add(btn1);
        add(btn2);
        add(btn3);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("JFrame 상에서 마우스 버튼이 눌렸다 풀림");
    }

    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) { }
    @Override
    public void mouseReleased(MouseEvent e) { }
}

public class EventHandler
{
    public static void main(String[] args) {
        JFrame frm = new MyJFrame("EventHandler");
        frm.setVisible(true);
    }
}
