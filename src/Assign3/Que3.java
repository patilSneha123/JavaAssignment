package Assign3;

import java.util.Scanner;

/*Given array of string check whether all the elements contains only digits not any alaphabets.
if condn satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1

Input1:{"asd","123","42.20"}
output:-1*/

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
String Input[]=new String[3];
boolean result = false;
for(int i=0;i<Input.length;i++)
{
	Input[i]=sc.next();
	 result=Input[i].matches("[0-9]+");//The syntax to use a String.matches() to check if String contains only digits is
	
}	
	if(result==true)
	{
		System.out.println("1");
	}
	else
		System.out.println("-1");
		
	}

}
