package Assign3;
/*8)count the number of times the second word in second string occurs in first string-case sensitive

input1=hai hello hai where hai Hai;
input2=what hai
output=3;*/

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input1="hai hello hai where hai Hai";
 
String input2="what hai";
String word[]=input2.split(" ");

	String s=word[1];
	int count=0;
	
	String s1[]=input1.split(" ");
	
	for(int i=0;i<s1.length;i++)
	{
		
		
		if(s.equals(s1[i]) )
		{
			
			count++;
		}
	}
	
	System.out.println(count);
	
	}

}
