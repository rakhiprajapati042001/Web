package chapter3;

import java.util.Scanner;

class HighestCommonFactorial{
	      int hcf;int remainder;
	      
	public void  HighestValue(int a,int b){
		
		 
		  
		  do
		  {
			  remainder=a%b;
			  if(remainder==0) {
			       hcf=b;
				  //System.out.println(hcf);
			  }
			  else
			  {       a=b;
				      b=remainder;
				     
			  }
		  }while(remainder!=0);
		  System.out.println("the hcf is  "+hcf);
		  
		  
		  
		  return ;
		  
	}
	
}

public class Hcf {

	public static void main(String[] args) {
		  int i=11;
		do
		{ 
			System.out.println(i);
			i+=1;
		}while(i<10);
		System.out.println("loop");

		Scanner sc=new Scanner(System.in);
		  System.out.println("enter dividend");
		  int a=sc.nextInt();
		  System.out.println("enter second divisor");
		  int b=sc.nextInt();
	     HighestCommonFactorial ob= new HighestCommonFactorial();
	     ob.HighestValue(a,b);
}

}