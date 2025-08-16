package DSA;
public class HelloWorld {
	int c12345=0;
	void delay(int n,int b)
	{
		HelloWorld h1=new HelloWorld();
		for(int i=0;i<Math.pow(n,n);i++)
		{
			b+=1;
			System.out.print("");
		}
	}

	public static void main(String[] args) {
		HelloWorld h=new HelloWorld();
		String k="hi tarun";
		//String k="hello world";
		String k1=" abcdefghijklmnopqrstuvwxyz";
		char ai=k.charAt(0);
		String[] a=k.split("");
		String[] a1=k1.split("");
		String re="";
		int count=0,b=0;
		for(int i=0;i<k.length();i++)
		{
			for(int j=0;j<k1.length();j++)
			{
				String r=a1[j];
				count+=1;
				h.delay(7,b);
				System.out.println(re+r);
				if(a[i].equals(a1[j]))
				{
					re+=a[i];
					//System.out.println(re+r);
					break;
				}
			}
			if(re.length()-1==a.length)
			{
				break;
			}
		}
		System.out.println(count+" ,"+Math.pow(7, 7)*1);

	}

}
