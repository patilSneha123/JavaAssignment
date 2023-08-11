package Assign1;

import java.util.Scanner;

//Find no of characters in a given string which are not repeated.
//input: "hello"
//output: 3
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		String s1=" ";
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				count++;
				s1=s1+s;
			}
		}
		
	System.out.println(count);	
	}

}
