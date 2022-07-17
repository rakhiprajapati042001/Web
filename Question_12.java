package chapter3;

import java.util.Scanner;

class largestNumber{
	
	public void Find() {
		char c;
		do {
		 int temp;
		 int i;
		Scanner sc=new Scanner(System.in);
		  System.out.println("how many number you want to enter");
		  int n=sc.nextInt();
		  int[] arr= new int[n];
		 
	        for(i=0;i<=n-1;i++) 
	        {
			  System.out.println("enter the number of "+i);
			  arr[i]=sc.nextInt();
			  
		    }
	        for( int j=0;j<=arr.length-1;j++) {
	        	
	        	
	        		if(arr[j]>arr[j+1]) {
	             		  temp=arr[j+1];
	             		  arr[j+1]=arr[j];
	             		  arr[j]=temp;
	             		 
	        	}
	        		j=arr.length-1;
	        		System.out.println("the maximum lagest number is "+arr[j]);
	        }
	        
	        
	          for( int k=0;k<=arr.length-1;k++) {
	                  if(arr[k]<arr[k+1])
	        		{
	        			 temp=arr[k+1];
	             		  arr[k+1]=arr[k];
	             		  arr[k]=temp;
	             		 
	        		}
	        		 k=arr.length-1;
	        		 System.out.println("the smallest number is "+arr[k]);
	          }
	        		 System.out.println("do you want to continue...............y/n");
	  		       c=sc.next().charAt(0);	
	  		       
	  	  	    }while(c=='y'|| c=='Y');
	  	  		System.out.println("thankyou for being with us");
		
	}
	        	
	        
		
		
		}
	

public class Question_12 {
	public static void main(String[] args) {
		largestNumber ob=new largestNumber();
		ob.Find();
		
	}
}
