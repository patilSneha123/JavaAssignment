package Assign2;

import java.util.Scanner;

/*compare two strings, if the characters in string 1 are present in
string 2, then it should be put as such in output, else '+' should be
put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+*/

public class Que16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String input1="New York";
String input2="NWYR";
for(int i=0;i<input1.length();i++)
{
	for(int j=0;j<input2.length();j++)
	{
		if(input1.toUpperCase().charAt(i)==input2.charAt(j))
		{
			System.out.print(input1.charAt(i)+"+");
		}
	}
}

	}

}
