package DSA;

public class LeapYear {

	public static void main(String[] args)
{
		//finding next 20 leap years without % opearator
			int ly=0;
			for(int i=1899;i<2300;i++)
			{
				int q=i/4,q1=i/400,q2=i/100;
				if(q*4==i && ly<=200 && q2*100!=i)
				{
					ly+=1;
					System.out.println("Year:"+i);			
				}
				if(i==q1*400)
				{
					System.out.println("Century Year:"+i);
					
				}
			}
	}

}
