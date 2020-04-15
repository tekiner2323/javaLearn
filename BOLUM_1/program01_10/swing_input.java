import javax.swing.JOptionPane;

public class swing_input
{
	public static void main (String[] args)
	{
		String isim = JOptionPane.showInputDialog("İsim girme Penceresi");
		JOptionPane.showMessageDialog(null,"İsminiz: "+isim, "Swing_input", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
		
	}
	

}
