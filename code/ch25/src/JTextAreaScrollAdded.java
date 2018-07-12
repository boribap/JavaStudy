import javax.swing.*;
import java.awt.*;

public class JTextAreaScrollAdded
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

        // JScrollPane simpleScroll = new JScrollPane(area);
        JScrollPane simpleScroll = new JScrollPane(area, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(simpleScroll);
        frame.add(btn);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
