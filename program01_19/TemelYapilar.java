import java.io.*;
import java.util.Scanner;

public class TemelYapilar
{
	public static void main(String[] args)
	{
		System.out.println("Örneğimizde basitçe bir sayı alınacak ve sayı pozitif veya negatiflik durumu incelencek.");
		Scanner giris = new Scanner (System.in);
		int sayi= giris.nextInt();
		
		if (sayi<0)
		{
		System.out.println("Girilen sayı NEGATİF");
		}
		else if(sayi>0)
		{
		System.out.println("Girilen sayı POZİTİF");
		}
		else
		{
		System.out.println("Girilen sayı SIFIRDIR");
		}
	
	}


}
