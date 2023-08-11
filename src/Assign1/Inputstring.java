
/*Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/

package Assign1;

import java.util.Scanner;

public class Inputstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input String" );
Scanner sc=new Scanner(System.in);
String s1=sc.next();
System.out.println(negativeString( s1));

	}
	
	
	private static int negativeString(String s1) {
		// TODO Auto-generated method stub
	int n1=0;
	if(s1.startsWith("-")) {
		int n=Integer.parseInt(s1);
		if(n<0)
			n1=Math.abs(n);
		
	}
	
	else
		n1=-1;
	
	
	
	return n1;
	}}
	

