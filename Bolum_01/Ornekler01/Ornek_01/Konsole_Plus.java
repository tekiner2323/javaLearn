


class Konsole_Plus
{
	public static void main(String[] args)
	{
		String cikis ="";
		System.out.println("BAŞLANGIÇ");
		
		for (int y = 0; y<9; y++)
		{
			System.out.println("1) y="+ y);
			for (int x=0; x<9; x++)
			{
				System.out.println("2) x="+ x +" y="+ y);
				if(y==4)
				{
					cikis=cikis+"* ";
					System.out.println("Sütuna  *	eklendi");
					System.out.println("3) x="+ x +" y="+ y);
				}
				else
				{
					if(x==4)
					{ 
					cikis=cikis+"*";
					System.out.println("Sütuna  *	eklendi");
					System.out.println("4) x="+ x +" y="+ y);
					}
					else
					{
					System.out.println("Sütuna	 boşluk  eklendi");
					System.out.println("5) x="+ x +" y="+ y);
					 cikis=cikis+"  ";
					}
				System.out.println("6) x="+ x +" y="+ y);	
					 
				}
				System.out.println("7) x="+ x +" y="+ y);
			}
			cikis=cikis+"\n";	
		}
		System.out.println("8) For Döngüleri sonu BİTİŞ");
		System.out.println(cikis);
	
	}

}

