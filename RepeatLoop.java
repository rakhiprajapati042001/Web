package chapter3;
import java.util.Scanner;
class Question_10{
	
	public void sum() { 
	      char c;
		do {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter first number");
	     int a=sc.nextInt();
	     System.out.println("enter second number");
	     int b=sc.nextInt();
	     int add=a+b;
	     System.out.println("result is "+add);
	     System.out.println(" do you want to continue y/n"); 
	       c=sc.next().charAt(0);	
	       
	    }while(c=='y'|| c=='Y');
		System.out.println("thankyou for being with us");
	  
	  
	  
	}
}



public class RepeatLoop {

	public static void main(String[] args) {
		Question_10 ob=new Question_10();
		ob.sum();
	}

}
