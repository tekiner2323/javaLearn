import javax.swing.*;
//import basicWindowMonitor;

// Normalda import gereklidir. Fakat aynı klasörde olunca import gereksizdir diye bir yazı okudum. İmport verince hata veriyordu lakin vermeyince sorunsuz derledi.

public class hosgeldinizSWF
{
    public static void main (String[] args)
    {

    JLabel mLabel = new JLabel("Java ders_3_2 mLabel");
    JFrame mFrame = new JFrame("mFrame");

    mFrame.addWindowListener (new basicWindowMonitor());
    mFrame.getContentPane().add(mLabel);
    mFrame.pack();
    mFrame.setVisible(true);
    
    }
}
