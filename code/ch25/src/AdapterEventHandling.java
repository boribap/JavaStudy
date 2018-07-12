import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PWHandler implements ActionListener
{
    JTextField id;
    JPasswordField pw;

    public PWHandler(JTextField id, JPasswordField pw)
    {
        this.id = id;
        this.pw = pw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ID : " + id.getText());
        // password 데이터는 char형이기 때문에 string인스턴스를 생성해야 한다.
        System.out.println("PW : " + new String (pw.getPassword()));
        // 빈문자열 보냄으로써 텍스트에 입력된 문자열 지우는 용도
        id.setText("");
        pw.setText("");
    }
}

public class AdapterEventHandling
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLable & JTextField");
        frame.setBounds(120,120,180,80);
        frame.setLayout(new GridLayout(2,2));

        JLabel idLabel = new JLabel("ID", SwingConstants.RIGHT);
        JTextField idText = new JTextField(10);

        JLabel pwLabel = new JLabel("PW", SwingConstants.RIGHT);
        JPasswordField pwText = new JPasswordField(10);
        pwText.setEchoChar('*');

        pwText.addActionListener(new PWHandler(idText, pwText));

        frame.add(idLabel); frame.add(idText);
        frame.add(pwLabel); frame.add(pwText);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
