import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame2 extends Frame implements ItemListener {
    Label l;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;

    MyFrame2(){
        super("CheckBox Implement");
        l = new Label("Nothing is Selected: ");


        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");

        cbg=new CheckboxGroup();

        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("C#",false,cbg);


        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";

        if(c1.getState())
            str=str+" "+c1.getLabel();
        if(c2.getState())
            str=str+" "+c2.getLabel();
        if(c3.getState())
            str=str+" "+c3.getLabel();
        if(str.isEmpty())
            str="Nothing is Selected";

        l.setText(str);
    }
}
public class CheckBoxEvent {
    public static void main(String[] args) {
        MyFrame2 fm = new MyFrame2();
        fm.setSize(400, 450);
        fm.setVisible(true);
    }
}
