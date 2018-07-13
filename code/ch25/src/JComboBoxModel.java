import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

class MyFriend
{
    String name;
    int age;

    public MyFriend(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public void showFriendInfo()
    {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}

class ChoiceHandler implements ItemListener
{
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            System.out.println("Selected... ");
            ((MyFriend)e.getItem()).showFriendInfo();
        }
        else
        {
            System.out.println("Deselected... ");
            ((MyFriend)e.getItem()).showFriendInfo();
        }
    }
}

class TextChangeHandler implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getActionCommand()).compareTo("ComboBoxEdited") == 0)
        {
            System.out.println("ComboBox Edited");
        }
        else
        {
            System.out.println("ComboBox Changed");
        }
    }
}

public class JComboBoxModel
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Choice Component");
        frame.setBounds(120,120,250,120);
        frame.setLayout(new GridLayout(0,2));

        Vector<MyFriend> friend = new Vector<>();
        friend.add(new MyFriend("bo", 22));
        friend.add(new MyFriend("do", 22));
        friend.add(new MyFriend("ho", 22));
        friend.add(new MyFriend("po", 22));

        JLabel label1 = new JLabel(" ComboBox");
        JComboBox comboBox1 = new JComboBox(friend);
        comboBox1.setMaximumRowCount(3);
        comboBox1.addItemListener(new ChoiceHandler());

        JLabel label2 = new JLabel(" Editable ComBox");
        JComboBox comboBox2 = new JComboBox(friend);
        comboBox2.setEditable(true);
        comboBox2.addActionListener(new TextChangeHandler());

        frame.add(label1); frame.add(comboBox1);
        frame.add(label2); frame.add(comboBox2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
