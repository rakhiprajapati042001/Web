package string;

public class JoinMethod {

	public static void main(String[] args) {

    String sc ="rakhi is is is  pajapati";
    String l="";
    String sc1="java";
    System.out.println(String.join("'",sc,sc1));
    System.out.println(10+sc);
    System.out.println(sc+102+79);
    System.out.println(10+20+30+sc1);
    System.out.println(sc+20/5);
    System.out.println(20/2+sc1);
    System.out.println(sc.concat(sc1));
    System.out.println(sc+sc1);
  //  System.out.println(sc.concat(10));
    System.out.println();
    System.out.println(sc.compareTo(l));
    System.out.println(sc.subSequence(3,9));
    System.out.println(sc.substring(3,9));
    System.out.println(sc.replaceAll("is(.)", "was"));//no space
    System.out.println(sc.replace("i", "j"));
    System.out.println(sc.replaceFirst("i", "j"));
    
    System.out.println(sc.replace("is", "was"));
    System.out.println(sc.replaceAll("is(.*)", "j"));
    
    System.out.println(sc.indexOf('e'));
    System.out.println(sc.indexOf('k'));
    System.out.println(sc.lastIndexOf('k'));//not
    
    
    System.out.println(sc.contains("kh"));
    System.out.println(sc.startsWith("ra"));
    System.out.println(sc.endsWith("ti"));
    System.out.println(sc.startsWith("Ra"));
    
    int a=10;
    System.out.println(String.valueOf(a));
    //System.out.println(a.getClass());
    
    
    
	}

}
