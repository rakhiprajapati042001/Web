package chapter3;
import java.util.Scanner;
  class anymouns{
	  public void mux(int[] no){
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the any positive number you want to print the table");
		  int n=sc.nextInt();
		  for(int i:no) {
			System.out.println(n+"*"+i+"="+i*n);  
			  
		  }
		return;  
	  }
	  
  }
public class TableThrowArray {

	public static void main(String[] args) {
		anymouns ob=new anymouns();
		ob.mux(new int[] {1,2,3,4,5,6,7,8,9,10});

	}

}
