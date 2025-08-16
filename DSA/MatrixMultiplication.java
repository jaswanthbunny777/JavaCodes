package DSA;
//now add,sub and multiplication and later transpose and inverse are 
//assignments
public class MatrixMultiplication {

	public static void main(String[] args) 
	{
		int[][] add = {{0,0,0},{0,0,0},{0,0,0}},
		sub={{0,0,0},{0,0,0},{0,0,0}}
		,multi={{0,0,0},{0,0,0},{0,0,0}};
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b={{7,5,3},{5,1,9},{4,3,2}};
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				add[i][j]=a[i][j]+b[i][j];
				sub[i][j]=a[i][j]-b[i][j];
				for(int k=0;k<=2;k++)
				{
					multi[i][j]+=a[i][k]*b[k][j];
				}
				
			}
		}
		int det=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
		System.out.println("Determinent is :"+det);
		System.out.println("The sum of the matrices is:\n[");
	     for (int i = 0; i < 3; i++) {
	    	    System.out.print("[");
	            for (int j = 0; j < 3; j++) {
	            	
	                System.out.print(add[i][j] + ",");
	            }
	            System.out.print("]");
	            System.out.println();
	        }
	     System.out.println("]");
	     
	     System.out.println("The substraction of the matrices is:\n[");
	     for (int i = 0; i < 3; i++) {
	    	    System.out.print("[");
	            for (int j = 0; j < 3; j++) {
	            	
	                System.out.print(sub[i][j] + ",");
	            }
	            System.out.print("]");
	            System.out.println();
	        }
	     System.out.println("]");
	     
	     System.out.println("The multiplication of the matrices is:");
	     for (int i = 0; i < 3; i++) {
	    	    System.out.print("[");
	            for (int j = 0; j < 3; j++) {
	            	
	                System.out.print(multi[i][j] + ",");
	            }
	            System.out.print("]");
	            System.out.println();
	        }
	     System.out.print("]");
	     
	     System.out.println("\nThe Transpose of the matrix a is:");
	     for (int i = 0; i < 3; i++) {
	    	    System.out.print("[");
	            for (int j = 0; j < 3; j++) {
	                System.out.print(a[j][i] + ",");
	            }
	            System.out.print("]");
	            System.out.println();
	        }
	     System.out.print("]");


	}

}
