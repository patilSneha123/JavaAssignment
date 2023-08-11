package Assign3;

import java.util.Scanner;

/*11)Get all the numbers alone from the string and return the sum.throws NumberFormatException -- contains te
Input"123gif"
Output:6*/

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Input");
String Input=sc.next();
int sum=0;
for(int i=0;i<Input.length();i++)
{
	char ch=Input.charAt(i);//each value of Input Stored into character
	if(Character.isDigit(ch))//checking the given Input is integer or not
	{
		String s=String.valueOf(ch);//Integer value of String stored into s
		int n=Integer.parseInt(s);//Integer value of String convert into Integer
		sum=sum+n;//Summation of all Integer values
		
		
	}


}
System.out.println(sum);
	}

	

}
