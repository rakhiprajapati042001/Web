package string;

public class CharacterOccurence {

	public static void main(String[] args) {
	int[] arr= new int[127];
	String str="meeeeeee  sh   iiii   iiii    iii   ii";
	str=str.replaceAll("\\s",""); //space remove
	System.out.println(str);
	for(int i=0;i<=str.length()-1;i++) {
		 
		arr[str.charAt(i)]= arr[str.charAt(i)]+1;
	
	}
	//char[] chr=new char[127];
     //  chr=str.charAt[i];
////		System.out.println(arr[0]+" char value "+chr);
////	
	
  int max=-1;
  char c=' ';
  
  
	for(int i=0;i<=str.length()-1;i++) {
		
		if(max<arr[str.charAt(i)])
		{
			max=arr[str.charAt(i)];
			c=str.charAt(i);
	
	}
	}
	System.out.println("the characcter is "+c+"------------and occur  "+max+"  times");
//	System.out.print(max);
		
	char chr=' ';
	for(int j=0;j<=arr.length-1;j++){
		if(arr[j]!=0) {
			System.out.println("welcome");
		    chr=str.charAt(j);
		System.out.println(arr[j]+" char value "+chr);
		}
	}
	
	}
}
	


