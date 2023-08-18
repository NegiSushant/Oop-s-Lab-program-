import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField t;
    Button b;

    MyFrame(){
        super("Frame");
        setLayout(new FlowLayout());

        l = new Label("LAble");
        t = new TextField(20);
        b = new Button("Hey");

        add(l);
        add(t);
        add(b);
    }
}
public class AWTExample {
    public static void main(String[] args){
        MyFrame m = new MyFrame();
        m.setSize(300, 300);
        m.setVisible(true);
    }
}
