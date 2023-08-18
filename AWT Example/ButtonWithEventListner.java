import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends Frame implements ActionListener{
    int count = 0;
    Label l;
    Button b;

    MyFrame1(){
        super("ButtonEvent");

        l = new Label("   "+count);

        b = new Button("Click Me");
        b.addActionListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(b);

    }

    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("   "+count);
    }
}
public class ButtonWithEventListner {
    public static void main(String[] args) {
        MyFrame1 fm = new MyFrame1();
        fm.setSize(300, 400);
        fm.setVisible(true);
    }
}
