package chapter3;

import java.util.Scanner;
import java.util.Scanner;
class power{
	 int c=1;
	  public void RaisedPower(int a,int b) {
		for(int i=1;i<=b;i++) {
			
		
		   c=c*a;
		}
		  System.out.println("the value of a power b is "+c);
		  return ;
		  
		  
		  
	  }
	 
 }



public class Question_5 {

	public static void main(String[] args) {
		power ob = new power();
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter first number");
		  int a=sc.nextInt();
		  System.out.println("enter second number");
		  int b=sc.nextInt();
		ob.RaisedPower(a,b);
	}
	
	
}
