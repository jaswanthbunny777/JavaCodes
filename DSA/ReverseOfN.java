package DSA;

public class ReverseOfN {
public static void main(String[] args) {
	int ld,rn=0,n=123456789;
	while(n>0){
		ld=n%10;
		rn=ld+rn*10;
		n=n/10;
	}
	System.out.println(rn);
}
}
