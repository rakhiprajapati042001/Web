package chapter3;
import java.util.Scanner;
  class  Sign{
	  
	      public void indicate() {
	    	//  int positive=0,negative=0,zero=0;
	    	  char c;
	    	  do {
	    		  int positive=0,negative=0,zero=0;
	    	  Scanner sc=new Scanner(System.in);
			  System.out.println("how many number you want to enter");
			  int n=sc.nextInt();
			  int[] arr= new int[n];
			 
		        for(int i=0;i<=n-1;i++) 
		        {
				  System.out.println("enter the number of "+i);
				  arr[i]=sc.nextInt();
				  
			    }
		        
		        for(int j=0;j<=arr.length-1;j++)
		        {
		        	
		        	if(arr[j]>0) {
		        		
		        		positive++;
		        	}
		        	else if(arr[j]<0)
		        	{
		        		negative++;
		        	}
		        	else
		        	{
		        		zero++;
		        	}
		        
		        }
		       System.out.println("the total positive number is "+positive); 
		       System.out.println("the total negative number is "+negative);  
		       System.out.println("the total zero number is "+zero); 
		       System.out.println("do you want to continue...............y/n");
		       c=sc.next().charAt(0);	
		       
	  	    }while(c=='y'|| c=='Y');
	  		System.out.println("thankyou for being with us");
	    	    
		        
		        
		        
	      }
	  
	  
	  
	  
	  
  }






public class Question_11 {

	public static void main(String[] args) {
		 Sign ob=new  Sign();
		ob.indicate();
	}

}
