package PhoneBook;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    private final JLabel l1;
    private final JLabel l2;
    private final JTextField t1;
    private final JTextField t2;
    private final JButton b;

    Login(){
        this.setDefaultCloseOperation(3);
        this.setTitle("F_C");
        this.setLayout(null);
        this.setSize(400,400);

        l1 = new JLabel("F");
        l1.setBounds(0,0,50,50);
        l2 = new JLabel("C");
        l2.setBounds(0,50,50,50);

        t1 = new JTextField();
        t1.setBounds(50,0,100,50);
        t2 = new JTextField();
        t2.setBounds(50,50,100,50);
        t2.setEditable(false);

        b = new JButton("Convert");
        b.setFocusable(false);
        b.setBounds(150,0,100,50);
        b.addActionListener(this);

        this.add(l1);
        this.add(l2);
        this.add(t1);
        this.add(t2);
        this.add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        int f = Integer.parseInt(t1.getText());
        int c = (f-32)*5/9;
        if(e.getSource() == b){
            t2.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
        Login f = new Login();

        f.setVisible(true);
    }
}