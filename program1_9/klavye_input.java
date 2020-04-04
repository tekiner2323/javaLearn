import java.io.*;
import java.util.*; //Yada sadece java.util.Scanner import edilebilirdi.
import Text;

class klavye_input
{
	public static void main (String[] args)
	{
	Scanner giris = new Scanner (System.in); //Scanner --> Java Util  Kullanılan 3 farklı sistem gösterilmiştir.
//	BufferedReader BRgiris = new BufferedReader(new InputStreamReader(System.in));  //java.io
//	Text Tgiris = new Text();
	
	System.out.print("Lütfen isminizi girermisiniz:");
	
	String isim = giris.nextLine();
//	isim=BRgiris.readLine();
//  isim=Tgiris.readString();
	System.out.println("Hoşgeldiniz "+isim);
	}
}
