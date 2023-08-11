package Assign2;

/*input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2*/

public class Que17 {
	public static String searchingString(String s1,String s2,String s3)
	{
		if(s1.contains(s2) && s1.contains(s3))
		if(s1.startsWith(s2) ||s1.endsWith(s3))
			return "1";
		return "2";
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="GeniusRajkumarDev";
String s2="Raj";
String s3="Dev";
System.out.println(searchingString(s1, s2, s3));
	}

}
