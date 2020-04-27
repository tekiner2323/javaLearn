

class Program04_01
{
	public static void main(String[] args)
	{
		int kacgun[] = new int[12];
		kacgun[0]=31;
		kacgun[1]=28;
		kacgun[2]=31;
		kacgun[3]=30;
		kacgun[4]=31;
		kacgun[5]=30;
		kacgun[6]=31;
		kacgun[7]=31;
		kacgun[8]=30;
		kacgun[9]=31;
		kacgun[10]=30;
		kacgun[11]=31;
		
		String[] haftanınGunleri = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
		
		int toplam=0;
		for (int i = 0 ; i<kacgun.length; i++)
		{
			toplam+=kacgun[i];
		}
		
		System.out.println(toplam);

		for (int i = 0 ; i<haftanınGunleri.length; i++)
		{
			System.out.println(haftanınGunleri[i]);
		}
		
	}
}
