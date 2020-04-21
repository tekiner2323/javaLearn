import java.util.Scanner;
public class Ornek_03
{

	public static void main (String[] args)
	{
		Scanner consol_oku = new Scanner(System.in);
		System.out.print("Satir Sayısı giriniz: ");
		int satir_sayisi=consol_oku.nextInt();
		int simetri=satir_sayisi;
		String cikti="";
		int simetri_sol, simetri_sag;
		for (int satir=0; satir<satir_sayisi+1;satir++)
		{
			for(int sutun=0; sutun<satir_sayisi*2+1; sutun++)
			{
				simetri_sol=simetri-satir;
				simetri_sag=simetri+satir;

				if(sutun>=simetri_sol && sutun<=simetri_sag)
				{
					cikti=cikti+"*";
				}
				else
				{
					cikti=cikti+" ";
				}
				
			}
			cikti=cikti+"\n";
		}
		System.out.println(cikti);
	}
	
}
