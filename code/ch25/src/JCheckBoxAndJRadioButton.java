import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class CheckBoxHandler implements ItemListener
{
    JRadioButton btn1;
    JRadioButton btn2;
    JRadioButton btn3;

    public CheckBoxHandler(JRadioButton b1, JRadioButton b2, JRadioButton b3)
    {
        btn1 = b1;
        btn2 = b2;
        btn3 = b3;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        }
        else {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
    }
}

public class JCheckBoxAndJRadioButton
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Choice Component");
        frame.setBounds(120,120,200,200);
        frame.setLayout(new GridLayout(0,1));

        JCheckBox checkBox = new JCheckBox("Are you a programmer");

        JRadioButton rbtn1 = new JRadioButton("a");
        JRadioButton rbtn2 = new JRadioButton("b");
        JRadioButton rbtn3 = new JRadioButton("c",true);
        // 그룹을 이루어야 버튼 한개만 선택 가능
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(rbtn1); bGroup.add(rbtn2); bGroup.add(rbtn3);

        Border rbtnBorder = BorderFactory.createEtchedBorder();
        rbtnBorder = BorderFactory.createTitledBorder(rbtnBorder, "Language");

        JPanel rbtnPanel = new JPanel();
        rbtnPanel.setLayout(new GridLayout(0,1));
        rbtnPanel.setBorder(rbtnBorder);

        rbtnPanel.add(rbtn1);
        rbtnPanel.add(rbtn2);
        rbtnPanel.add(rbtn3);

        checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
        frame.add(checkBox); frame.add(rbtnPanel);

        rbtn1.setEnabled(false);
        rbtn2.setEnabled(false);
        rbtn3.setEnabled(false);

        rbtn1.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED)
                        {
                            System.out.println("a");
                        }
                    }
                }
        );
        rbtn2.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED)
                        {
                            System.out.println("b");
                        }
                    }
                }
        );
        rbtn3.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED)
                        {
                            System.out.println("c");
                        }
                    }
                }
        );

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
