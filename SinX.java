package Chapter_3;
import java.util.Scanner;

//import chapter3.power;
public class SinX {

	  public void Series(int a,int x) {
		//  int sum=0;
		  float sign=1;
		  double sum=0;
		  for(int i=1;i<=a;i=i+2) {
			
			 factorial ob= new factorial();
			// System.out.println(i);
			    int result =ob.fact(i);
			   System.out.println(" the factorial is "+result);
		    factorial_recursion ob1=new factorial_recursion();
			     double power =ob1.RaisedPower(x,i);
			   System.out.println(power+"power");
			     sum=sum+(power*sign)/result;
			  
			    sign*=-1;
			//    System.out.println("the sum of this series is"+sum );
		
		  }
	//	  System.out.println("welcome");
		  System.out.println("Sin"+x+":"+sum);  
	
	  }
	
	public static void main(String[] args) {
		SinX ob= new SinX();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("enter a x value");
		int x=sc.nextInt();
		ob.Series(n,x);
		
	}

}
