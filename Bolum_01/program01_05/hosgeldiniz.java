import javax.swing.*;
import java.awt.*;

//import basicWindowMonitor;
//import vermek yerine derlerken ve çalıştırırken -cp ekleniyor.

public class hosgeldiniz extends JFrame
{

    public void paint (Graphics g)
    {
        g.drawString("Java Sinifina hosgeldiniz!" , 10, 40);
    

    }
ll
    public static void main (String[] args)
    {
        hosgeldiniz mhosgeldiniz = new hosgeldiniz();
        mhosgeldiniz.addWindowListener(new basicWindowMonitor());
        mhosgeldiniz.setSize(250,200);
        mhosgeldiniz.setVisible(true);    

    }

}
