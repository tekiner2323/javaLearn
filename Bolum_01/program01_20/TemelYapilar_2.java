import java.io.*;
import java.util.Scanner;


public class TemelYapilar_2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen kıyaslamak istediğiniz sayiyi giriniz: ");
		int sayi = input.nextInt();
		
		
		if (sayi >=0 && sayi < 10)
		{
			System.out.println("Sayı [0 - 10) aralığındadır ");
		}
		else if (sayi>= 10 && sayi < 20 )
		{
			System.out.println("Sayı [10 - 20) aralığındadır ");
		}
		else if (sayi>= 20 && sayi < 30 )
		{
			System.out.println("Sayı [20 - 30) aralığındadır ");
		}
		else if (sayi>= 30 && sayi < 40 )
		{
			System.out.println("Sayı [30 - 40) aralığındadır ");
		}
		else
		{
		  	System.out.println("Sayı kontrol aralığı dışındadır ");
		
		}
	
	}


}
