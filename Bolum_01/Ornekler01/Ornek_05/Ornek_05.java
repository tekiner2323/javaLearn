

import java.util.Scanner;

public class Ornek_05
{

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sayi=input.nextInt();
		long faktoriel=1;
		int i = 1;
		while(i <= sayi)
		{
			faktoriel=faktoriel * i;
			i++;
		}
		
		System.out.println(faktoriel);
		
	}
	
	
}

	/*long maksimum 9223372036854775807 değerini alabilir. Bitlerle çalışmışsanız bilginiz vardır. Örnek olarak
	 1111
	    1
	+_____    	işlemini sonucu 4 bitlik bir işlemcide
   1 0000	 	şeklindedir. Ve sayıyı yazdırırsanırz 0 sonucunu görürsünüz. Javada'da böyle oluyor. Yukarıdaki değeri geçince sayı negatif sayıdan geri gelmeye başlıyor doğal olarak. :)*/
	
