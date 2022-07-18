package Chapter_3;
import java.util.Scanner;
public class factorial {
	 int mul=1;
	  public int fact(int a){
		 
		  for(int i=a;i>=1;i--) {
				mul=mul*i;
			}
		//System.out.println(mul);	
		return mul;
	  }
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		 factorial ob= new factorial();
		 ob.fact(n);
		
		
		
	}

}
