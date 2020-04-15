import java.util.Scanner;

public class TemelYapilar4
{
	public static void main (String[] args)
	{
		Scanner giris = new Scanner(System.in);
		System.out.print("Tabak Kirlilik oranı giriniz: ");
		int tabak = giris.nextInt();
		int yikamaSay=0;
		do
		{
		yikamaSay++;
		
		}while(++tabak<=100);
		
		System.out.println("Tabak yımaka sayısı= "+yikamaSay);
		
		
	}
	
}
