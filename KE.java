import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KE implements KeyListener
{
    Label lb1, lbl2, lb;
    TextField tf1;
    Frame fr;
    String s;
    KE()
    {

        fr = new Frame("KeyEventListener Example");

        lb1= new Label(" Key Events will be displayed based on the actions", Label.CENTER);
        lbl2= new Label();
        lb= new Label();

        tf1 = new TextField(20);
        fr.setLayout(new FlowLayout());

        fr.add(lb1);

        fr.add(tf1);

        fr.add(lbl2);

        tf1.addKeyListener(this);

        fr.setSize(460,250);

        fr.setVisible(true);
    }

    public void keyPressed(KeyEvent ev)
    {
        lbl2.setText(" Key pressed");
    }

    public void keyReleased(KeyEvent ev)
    {
        lbl2.setText("Released");
    }

    public void keyTyped(KeyEvent ev)
    {
        lbl2.setText("Key is typed");

        fr.setVisible(true);
    }
    public static void main(String[] args)
    {
        new KE();
    }
}

