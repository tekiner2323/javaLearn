import javax.swing.*;
import java.awt.*;

import basicWindowMonitor;

public class hosgeldiniz extends Jframe
{

    public void paint (Graphics g)
    {
        g.drawString("Java Sinifina hosgeldiniz!" , 10, 50);
    

    }

    public static void main (String[] args)
    {
        hosgeldiniz mhosgeldiniz = new hosgeldiniz();
        mhosgeldiniz.addWindowListener(new basicWindowMonitor());
        mhosgeldiniz.setSize(160,50);
        mhosgeldiniz.setVisible(true);    

    }

}
