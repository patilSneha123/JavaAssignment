package Assign2;

import java.util.Scanner;

/*find the three consecutive characters in a string. if the string consists any
* three consecutive characters return 1 else return -1 like AAAxyzaaa will
* return true.*/
public class que7a {
	public static String cons(String s)
	{
		int count=0;
	char c[]=s.toCharArray();
	for (int i=0;i<s.length()-1;i++)
	{
		
		     if(s.charAt(i)==s.charAt(i+1))
			  count++;
	
	
	int count1=count;
		     if (count1==3 && count1<4)
		    	return" 1";
		     else 
		     if(count1>3 && count1<3)
		     break;
	}
			return "-1";
		   
			
		
		    
		    	
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");

		
		
		
		String input=sc.next();
		System.out.println(cons(input));
		
	}

}
