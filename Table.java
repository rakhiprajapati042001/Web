package chapter3;
import java.util.Scanner;
  class question3{
	  
	  
	  public void printTable() {
		  int mul=1;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number you want to print the table");
		  int n=sc.nextInt();
		  for(int i=1;i<11;i++) {
			  mul=i*n;
			  System.out.println(n+"*"+i+"="+mul);
		  }
		  
		  
	  }
	  
	  
  }


public class Table {

	public static void main(String[] args) {
		 question3 ob=new question3();
		 ob.printTable();

	}

}
