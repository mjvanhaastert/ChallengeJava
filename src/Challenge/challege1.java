package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class challege1 extends Applet {

    TextField tekstvak;
    Label label;
    String s;
    int a,b,c,d;

    public void init() {
        a = 10;
        b = 11;
        c = 12;
        d = 13;
        tekstvak = new TextField("", 10);
        label = new Label("Voer een uur in");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);


    }
    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            s = Integer.parseInt(a()) + Integer.parseInt(String.valueOf());

        }
    }
}
