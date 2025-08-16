package DSA;

public class FIBONACCI {
 public static void main(String[] args) {
	int f=0,s=1,t,n=7;
	for (int i=0;i<=n;i++) {
		System.out.println(f);
		t=f+s;
		f=s;
		s=t;
		
	}
}
}
