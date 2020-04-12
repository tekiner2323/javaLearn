import javax.swing.JOptionPane;



class aritmedik_swng
{
	public static void main (String[] args)
	{
		String s;
		int sayi1, sayi2;
		int toplam, fark, carpim, kalan;
		double bolum;
		
	    sayi1=Integer.parseInt(JOptionPane.showInputDialog("Birinci Sayiyi Giriniz"));
		sayi2=Integer.parseInt(JOptionPane.showInputDialog("İkinci Sayiyi Giriniz"));
	
		toplam = sayi1+sayi2;
		fark = sayi1-sayi2;
		carpim = sayi1*sayi2;
		bolum = (float)sayi1 / sayi2;
		kalan = sayi1%sayi2;
		
		
		s="Sayı 1 = " + sayi1+ "\n";		
		s=s+"Sayı 2 = " + sayi2+ "\n";
		s=s+"İşlemler aşağıdaki gibidir" + "\n";
		s=s+"Toplam" + toplam+ "\n";
		s=s+"Fark" + fark + "\n";
		s=s+"Çarpım" + carpim + "\n";
		s=s+"Bölüm" + bolum + "\n";
		s=s+"Kalan" + kalan + "\n";
		
		
		
		JOptionPane.showMessageDialog(null, s, "Aritmetik İşlemleri", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

}
