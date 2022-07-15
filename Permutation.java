package string;
import java.util.Scanner;
public class Permutation {
	
	
	
     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		cal ob=new cal();
		
		ob.counting(str, 0, str.length()-1);
	}

}
class cal{
	
	public String Swap(String str,int i,int j) {
		char[] ch=str.toCharArray();
		char b;
		b=ch[i];
		ch[i]=ch[j];
		ch[j]=b;
		str=String.valueOf(ch);
		return str;
	}
	int	count=0;
	 int i=1;
	public void counting(String str,int l,int r) {

		   if(l==r) {
			  
			   System.out.print("   "+str+" "+i);
			   i++;
		   }
		
		   else
		   {
			   for(int i=l;i<=r;i++) {
				   
				   str=Swap(str,l,i);
				   counting(str,l+1,r);
				   //str=Swap(str,l,i);
			   }
				   
				   
		   }   
	
		   }
}
