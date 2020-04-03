//import java.io.*;
import java.util.*; //Yada sadece java.util.Scanner import edilebilirdi.

class klavye_input
{
	public static void main (String[] args)
	{
	Scanner giris = new Scanner (System.in);
	System.out.print("Lütfen isminizi girermisiniz:");
	
	String isim = giris.nextLine();
	System.out.println("Hoşgeldiniz "+isim);
	}
}
