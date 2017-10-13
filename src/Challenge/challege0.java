package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class challege0 extends Applet{

    String tekstv,tekstj,teksth;

    Button knop;

    TextField tekst1;
    TextField tekst2;
    TextField tekst3;

    Label Valerie;
    Label Jeroen;
    Label Hans;

    int hoogtev;
    int hoogtej;
    int hoogteh;


    public void init() {


        tekst1 = new TextField("",10);
        Valerie = new Label("Valerie");
        add(Valerie);
        add(tekst1);

        tekst2 = new TextField("", 10);
        Jeroen = new Label("Jeroen");
        add(Jeroen);
        add(tekst2);

        tekst3 = new TextField("",10);
        Hans = new Label("Hans");
        add(Hans);
        add(tekst3);

        knop = new Button("Toon");
        knop.addActionListener(new KnopListneren());
        add(knop);

    }

    public void paint(Graphics g){

        //Geef de grootte van de applet aan, 600x600
        setSize(600,400);
        //het uiterlijk van de staafdiagram
        g.drawLine(100,300,100,20);
        g.drawLine(100,300,500,300);
        //
        g.drawLine(100,260,110,260);
        g.drawLine(100,220,110,220);
        g.drawLine(100,180,110,180);
        g.drawLine(100,140,110,140);
        g.drawLine(100,100,110,100);
        g.drawLine(100,60,110,60);
        //De waarde van de staafdiagram
        g.drawString("20",80,260);
        g.drawString("40",80,220);
        g.drawString("60",80,180);
        g.drawString("80",80,140);
        g.drawString("100",80,100);
        g.drawString("120",80,60);
        //
        g.drawString("Valerie",200,320);
        g.drawString("Jeroen",300,320);
        g.drawString("Hans",400,320);
        //Kolommen van de staaf diagram Valerie
        g.setColor(Color.red);
        g.fillRect(180,300 -(hoogtev*2),50, hoogtev*2);
        //Kolommen van de staaf diagram Jeroen
        g.setColor(Color.red);
        g.fillRect(280,300-(hoogtej*2),50, hoogtej*2);
        //Kollommen van de staaf diagram Hans
        g.setColor(Color.red);
        g.fillRect(380,300-(hoogteh*2),50, hoogteh*2);

    }


    class KnopListneren implements ActionListener {
        public void actionPerformed(ActionEvent e) {

         tekstv=tekst1.getText();
         tekstj=tekst2.getText();
         teksth=tekst3.getText();

         hoogtev = Integer.parseInt(tekstv);
         hoogtej = Integer.parseInt(tekstj);
         hoogteh = Integer.parseInt(teksth);
         repaint();

        }
    }
}
