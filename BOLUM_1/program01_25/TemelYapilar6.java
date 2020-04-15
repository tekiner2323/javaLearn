import java.util.Scanner;

public class TemelYapilar6
{
	public static void main (String[] args)
	{
		Scanner giris = new Scanner(System.in);
		
		String gelen = giris.nextLine();
		
		switch (gelen)
		{
			case "A" : case "a":
			System.out.println("1. harf");
			break;
			
			case "B" : case "b":
			System.out.println("2. harf");
			break;
			
			case "C" : case "c":
			System.out.println("3. harf");
			break;
			
			case "D" : case "d":
			System.out.println("4. harf");
			break;
			
			default:
			System.out.println("Tanımlanmayan bir harf girdiniz.");
		}
	
	}
	

}
