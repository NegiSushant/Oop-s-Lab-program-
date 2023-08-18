import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton B;


    int c = 0;

    MyFrame(){
        super("Swing First");
        l = new JLabel("Clicked "+c+" Times");
        B = new JButton("Click Me");

        setLayout(new FlowLayout());
        add(l);
        add(B);
        B.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c++;
        l.setText("Clicked "+c+" Time");
    }
}
public class FirstSwing {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
