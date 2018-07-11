import javax.swing.*;
import java.awt.*;

public class FirstSwing
{
    public static void main(String[] args) {
        JFrame frm = new JFrame("First Swing");
        // 120,120 은 GUI창의 위치를 지정하고, 400,100으로 GUI창의 가로, 세로 크기를 지정한다.
        frm.setBounds(120,120,400,100);
        // 컴포넌트의 배치를 FlowLayout이 담당한다는 의미
        frm.setLayout(new FlowLayout());

        JButton btn1 = new JButton("My button");
        JButton btn2 = new JButton("Yout button");
        JButton btn3 = new JButton("our button");

        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.setVisible(true);
    }
}
