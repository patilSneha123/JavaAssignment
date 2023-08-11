package Assign3;

import java.util.Scanner;

/*9)find the no.of characters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;*/

public class Que9 {
	
	public static void RepChar(String s)
	{
		int count=0;
		
		int count3=0;
		//char c[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1)  )
				count++;
			else
				count=0;
			
			if( count==2) 
			count3++;
			
		  if(count3>2 && count3<2 )
			 
			  break;
		 
				
		}
		System.out.println(count3);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Input");
String input=sc.next();

RepChar(input);

	}

}
