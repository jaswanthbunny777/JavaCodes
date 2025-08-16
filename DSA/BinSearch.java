package DSA;

public class BinSearch {
	void BSearch(int a[],int element)
	{
		int b=0;int e=a.length-1;
		int mid,c1=0;
		boolean c=true;
		while(c)
		{
			c1++;
			mid=(e+b)/2;
			if(a[mid]==element)
			{
				System.out.println("Element found:"+element+"\nno.of steps:"+c1);
				c=false;
			}
			else if(a[mid]<element)
			{
				b=mid+1;
			}
			else if(a[mid]>element)
			{
				e=mid-1;
			}
			else
			{
				System.out.println("Element not found");
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {5,9,17,21,32,44,55};
		BinSearch bs=new BinSearch();
		bs.BSearch(a, 44);
	}
}

