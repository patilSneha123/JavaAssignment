package Assign2;

/*find the three consecutive characters in a string. if the string consists any three 
consecutive characters return 1 else return -1
like AAAxyzaaa will return true.
*/
import java.util.Scanner;

public class alph {
	public static String consecutive(String st)
	{      int count=0; 
	String st1="";
	
		for (int i=0;i<st.length();i++)
		{
			   if(st.charAt(i)==st.charAt(i+1)) 
				   continue; 
			   if(st.charAt(i)>st.charAt(i+1)||st.charAt(i)<st.charAt(i+1))
				   count++; 
			   if (count>=2) 
				   return"1"; 
			   else
			       return"-1";
			 
		}
		return st1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");	
String input=sc.nextLine();
String alp=input.toLowerCase();
String s=" ";
for(char x='a';x<='z';x++)
{
	for(int i=0;i<alp.length();i++)
	{
		char c=alp.charAt(i);
		if(c==x)
		
		{
			s=s+c;
			
		}
	}




}
	
	System.out.println(s);
	System.out.println(consecutive(s));
	
	}

}
