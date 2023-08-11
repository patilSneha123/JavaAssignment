package Assign3;

import java.util.Scanner;

/*6)input={"1","2","3","4"}
output=10
ie,if string elements are nos,add it.
input={"a","b"}
output=-1;*/

public class Que6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter Total element ");
int n=sc.nextInt();
String[] input=new String[n];
System.out.println("Enter Array Element");
for(int i=0;i<n;i++)
{
	input[i]=sc.next();
}
		
boolean result=false;
int sum = 0;

for(int i=0;i<input.length;i++)
{
	
	if(result=input[i].matches("[0-9]+"))
	{
	   int Input=(int) Integer.parseInt(input[i]);
	   sum=sum+Input;
	}
	
	
}
if(result==true)
   System.out.println("Sum is="+sum);	
		
if(result==false)
	System.out.println("-1");

	
	}

}
