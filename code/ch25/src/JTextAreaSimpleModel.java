import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonTextHandler implements ActionListener
{
    JTextArea area;

    public ButtonTextHandler(JTextArea area)
    {
        this.area = area;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("모두 지웠습니다. \n");
        area.append("원하는 내용을 입력하세요. \n");
    }
}

public class JTextAreaSimpleModel
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLable & JTextField");
        frame.setBounds(120,120,180,80);
        frame.setLayout(new FlowLayout());

        JTextArea area = new JTextArea(10,20);
        area.append("원하는 내용을 입력하세요. \n");
        area.setCaretPosition(area.getText().length());

        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        JButton btn = new JButton("Clear");
        btn.addActionListener(new ButtonTextHandler(area));

        frame.add(area);
        frame.add(btn);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
