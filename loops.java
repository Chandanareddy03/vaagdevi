import java.util.Scanner;
public class loops{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
	    for(int i=1;i<n;i++) {
		    for(int j=1;j<m;j++) {
			    if(i== 1|| i==n-1 || j==1 || j==m-1) {
				    System.out.print("*");
				
			    }else {
				    System.out.print(" ");
			    }
	
			    System.out.println();

		    }
	    }
	}
}


	


