import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FirstAWTExitEvent
{
    public static void main(String[] args) {
        Frame frm = new Frame("Frist Swing");
        frm.setBounds(120,120,400,100);
        frm.setLayout(new FlowLayout());

        WindowListener listene = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        frm.addWindowListener(listene);

        Button btn1 = new Button("My button");
        Button btn2 = new Button("Yout button");
        Button btn3 = new Button("our button");

        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.setVisible(true);
    }
}
