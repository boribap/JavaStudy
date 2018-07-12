import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterEventHandleing
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous");
        frame.setBounds(120,120,250,150);
        // Anonymous 클래스 정의
        frame.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("마우스 버튼 눌림");
                    }
                }
        );

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
