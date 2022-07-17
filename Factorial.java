package chapter3;
import java.util.Scanner;
  class FindFactorial{
	public void find(){
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number ");
		  int n=sc.nextInt();
		 int m=1;
		 for(int i=n;i>0;i--)
		 {
		    m=m*i;
	    }
  System.out.println(m);
	
	}
	
}	









public class Factorial {

	public static void main(String[] args) {
		
		  FindFactorial ob=new FindFactorial();
		  ob.find();

	}

}
