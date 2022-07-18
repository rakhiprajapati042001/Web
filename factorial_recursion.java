package Chapter_3;

import java.util.Scanner;

	

public class factorial_recursion {
	 long c=1;
	  public long RaisedPower(int a,int b) {
		for(int i=1;i<=b;i++) {
			
		   c=c*a;
		  // System.out.println("welcome");
		}
		  //System.out.println(c);
		  return c;	  
	  }

	public static void main(String[] args) {
		factorial_recursion  ob = new factorial_recursion ();
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter first number");
		  int a=sc.nextInt();
		  System.out.println("enter second number");
		  int b=sc.nextInt();
		ob.RaisedPower(a,b);
		
			 // System.out.println("the value of a power b is "+c);
	}

}

