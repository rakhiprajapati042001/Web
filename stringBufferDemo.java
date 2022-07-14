package string;

public class stringBufferDemo {

	public static void main(String[] args) {

   StringBuffer sc=new StringBuffer(); //default constructor 
   System.out.println(sc.capacity()); //16(by default)+length
   sc.append("jiiiiiiiiiiiiiiiia");
   System.out.println(sc);
   System.out.println(sc.capacity());
   
   
   
   
   StringBuffer sc1=new StringBuffer("rakhi");  //argument constructor
   System.out.println(sc1.capacity()); //16(bydefault)+length
   sc.append("jj");
   System.out.println(sc1);
   System.out.println(sc1.capacity());
   System.out.println(sc1.delete(1,2));//delete string sequence 
   System.out.println(sc1);
   System.out.println(sc1.deleteCharAt(3));
   
   StringBuffer s1=new StringBuffer("rakhi");
   StringBuffer s2=new StringBuffer("rakhi");
   System.out.println(s1.equals(s2));
   System.out.println(s1==s2);
   
   StringBuffer s3=s1.append("hello");
   System.out.println(s1.equals(s3));
   System.out.println(s1.insert(3, "good"));
   System.out.println(s1.reverse());
   s3.ensureCapacity(1000);  //define capacity of string object
   System.out.println(s3.capacity());
   s3.trimToSize();  //delete extra capacity
   System.out.println(s3 );
   System.out.println(s3.capacity());
   
   
   
	}

}
