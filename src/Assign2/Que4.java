package Assign2;

/*validate a password 
i) there should be atleast one digit
ii) there should be atleast one of '#','@' or '$' .
iii)the password should be of 6 to 20 characters
iv) there should be more uppercase letter than lower case.
v) should start with an upper case and end with lower case

*/
import java.util.Scanner;

public class Que4 {
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter");
	 String Pass=sc.next();
	int cap=0; int sma=0;
	char ch = 0;
	char First_val;
	char Last_val;
	First_val=Pass.charAt(0);
	Last_val=Pass.charAt(Pass.length()-1);
	int num=0;
	if(Pass.length()>=6 && Pass.length()<=20)
	
	 if(Character.isUpperCase(First_val) && Character.isLowerCase(Last_val))
	
		 if(Pass.contains("$")||Pass.contains("@")||Pass.contains("#"))

	{
			 
	         for(int i=0;i<Pass.length();i++)
	      {
		     ch=Pass.charAt(i);
		
	           if(ch>='A' && ch<='Z' )
		        cap++;
	
	           if(ch>='a' && ch<='z')
	            sma++;
	           if(ch>='0' || ch<='9')
	            num++;
	      }
	}
	           if(cap>sma)
	            {
		           System.out.println("Valid");
	             }else
		           System.out.println("Invalid");
 
	
	   
	}
 
	}
