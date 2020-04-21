//17-04-2020 14:55:30 

public class Ornek_02
{
	public static void main(String[] args)
	{
		int simetri=0;
		String cikti="";
		int yildiz_a;
		int yildiz_b;
		for(int satir=0;satir<9;satir++)
		{	
			if (satir<4)
			{
				yildiz_a=4-simetri;
				yildiz_b=4+simetri;
				simetri=simetri+1;
			}
			else
			{   simetri=simetri-1;
				yildiz_a=5-simetri-2;
				yildiz_b=5+simetri;
			}
			
			for(int sutun=0; sutun<9; sutun++)
			{
				if(sutun==yildiz_a || sutun==yildiz_b)
				{
				   cikti=cikti+"* ";
				}
				else
				{
				   cikti=cikti+"  ";
				}
				
			}
		
		
		
		cikti=cikti+"\n";
		}
		
		System.out.println(cikti);
	
	}
	

}
