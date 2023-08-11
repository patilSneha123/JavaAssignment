/*//Find no of characters in a given string which are not repeated.
input: "hello"
output: 3//
*/
package Assign1;

import java.util.Scanner;

public class Findcharacter {

	public static String Rep(String str) 
	{
		String str1=" ";
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);                     
			if(str1.indexOf(c)==-1) //if the character does not occure in string
			{
				
				str1=str1+c;
				count++;
			}
			
			
		}
		System.out.println(+count);

		return str1;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter input=");
String str=sc.next();
System.out.println(Rep( str) );







	}}

