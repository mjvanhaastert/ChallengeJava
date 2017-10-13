/* geen opdracht kladblok

package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class test extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    double getal;

    //Objecten op het scherm//

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new ClassTekstvak() );
        add(label);
        add(tekstvak);
    }

    //Wat in het geheugen gebeurt//

    class ClassTekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s);
            repaint();
        }

        public void paint(Graphics g) {
        g.drawString("Het getal is "+ getal, 50, 60 );
    }

    }
}

*/