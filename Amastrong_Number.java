package chapter3;





public class Amastrong_Number {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {	
			for(int j=1;j<=5;j++) {
				
				for(int k=5;k>=1;k--) {
					System.out.println("----------");
					if(i<=k) {
						System.out.println("welcomr");
						System.out.println(i);
						i--;
						}
					else
					{
						System.out.println("welcomr............");
						System.out.println(" ");
					}
				}
			}
		}
		
		
		
		
	}

}
