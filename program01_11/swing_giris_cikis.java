import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class swing_giris_cikis extends JApplet implements ActionListener
{
	JTextArea ciktiAlani;
	JLabel kutuBasligi;
	JTextField kutuGirdisi;
	String isim;
	
	public void init()
	{
	Container mContainer = new Container();;
	
	mContainer.setLayout(new FlowLayout());
	
	isim = "Ertuğrul Tekin";
	
	kutuBasligi = new JLabel("İsminizi Giriniz");
	//mContainer.add(kutuBasligi);
	
	add(kutuBasligi);
	
	kutuGirdisi = new JTextField(10);
	//mContainer.add(kutuGirdisi);
	add(kutuGirdisi);
	
	ciktiAlani = new JTextArea();
	Color mColor = mContainer.getBackground();
	
	ciktiAlani.setBackground(mColor);
//	mContainer.add(ciktiAlani);
	add(ciktiAlani);
	
	ciktiAlani.setText("ciktiAlani.setText: Java Birimi" + isim);
	
	kutuGirdisi.addActionListener(this);	
	add(kutuGirdisi);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
	isim = e.getActionCommand();
	ciktiAlani.setText("Java Sinifina Hoşgeldiniz" + isim);
	repaint();
	}

}
