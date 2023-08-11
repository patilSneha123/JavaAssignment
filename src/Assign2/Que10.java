package Assign2;

import java.util.Scanner;
import java.util.StringTokenizer;

/*GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234?*/

public class Que10 {
	public static String Display(String s)
	{
		StringTokenizer st=new StringTokenizer(s,"-");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
			
		StringBuffer sb=new StringBuffer();
		sb.append(s1.substring(0,s1.length()-1)).append("-");
		sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append("-");
		sb.append(s2.subSequence(1, s2.length())).append(s3.charAt(0)).append("-");
		sb.append(s3.subSequence(1, s3.length())).append("?");
		return sb.toString();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter input");
String input=sc.next();
System.out.println(Display(input));
	}

}
