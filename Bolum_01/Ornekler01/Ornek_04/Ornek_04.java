import java.util.Scanner;

class Ornek_04
{

	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("Alt Aralığı giriniz: ");
		int altsayi=input.nextInt();
		
		System.out.println("Üst Aralığı giriniz: ");
		int ustsayi=input.nextInt();
		
		boolean asal=false;
		
		for (int j = altsayi; j<=ustsayi; j++)
		{
			asal=false;
			for(int i = 2; i<j; i++)
			{
				if(j%i==0)
				{
					asal=false;
					
					break;
				}
				else
				{
				asal=true;
				}
			}
			if(asal==true)
			{
				System.out.println(j);
			}
			
		}
		
	}
}
