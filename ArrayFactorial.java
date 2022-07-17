package chapter3;

import java.util.Scanner;

class EvenOddPrint{
	
	   public void sum() {
		   int add1=0,add2=0;
		   Scanner sc=new Scanner(System.in);
			  System.out.println("enter the range of array");
			  int n=sc.nextInt();
			  int[] arr= new int[n];
			 
		        for(int i=0;i<=n-1;i++) 
		        {
				  System.out.println("enter the element of array "+" "+i);
				  arr[i]=sc.nextInt();
				  
			    }
		   
		       for(int j=0;j<arr.length;j++) 
		       {
			
			   System.out.print(arr[j]+" ");
			   System.out.print("  ");
			   
		      }
		 for(int i:arr) {
			 if(i%2==0) {
				 add1=add1+i;
			 }
			 else
			 {
				 add2=add2+i;
			 }
		
		 }
		 System.out.println("\nthe total of even number  "+add1);
		 System.out.println("the total of odd number  "+add2); 
	   }
	
	
}






public class ArrayFactorial {

	public static void main(String[] args) {
		EvenOddPrint ob=new EvenOddPrint();
		ob.sum();
	}

}
