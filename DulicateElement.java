package chapter3;
import java.util.Scanner;
public class DulicateElement {

	        public void Element(char arr[]){
	        	 for(int i=0;i<=arr.length-1;i++) {	        		 
	        		 System.out.println(arr[i]+" "+i);	        		 
	             	 }
	        		        	return ;
	              }
	       public void Find(char arr[],char temp[]) {
	        	int count=0;int j;
	        	Scanner sc=new Scanner(System.in);
	    		
	        	
	        	for(int i=0;i<=arr.length-1;i++)
	        	{
	        	  for(j=i+1;j<=arr.length-1;j++) 
	        	  {
	        	   	if(arr[i]==arr[j]) 
	        	   	{
	        			temp[i]=arr[j];
                   
	        		 
	        		}
	        	  }    
	        	  } 
     		//	 System.out.println("     duplicate element :  "+"   " +j+" "+temp[i]);      		}
	        	}
	        
	    public void showArray(char temp[]) {
	    	for(int k=0;k<=temp.length-1;k++) {
	    		if(=temp[k]) {
	    		    System.out.print(temp[k]+"0");
	    		}
	    	}
	    }
	
	
	
	public static void main(String[] args) {
		
		DulicateElement ob=new DulicateElement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		char[] arr= new char[n];
		System.out.println("enter any type of String");
		String name=sc.next();
		arr=name.toCharArray();
		System.out.println("enter the length of array for temp array");
		int x=sc.nextInt();

    	char [] temp= new char[x];
		ob.Element(arr);
		ob.Find( arr,temp);
		ob.showArray(temp);
		
		

	}

}
