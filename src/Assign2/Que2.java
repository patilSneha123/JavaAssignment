package Assign2;

import java.util.Scanner;

//Enter your name and return a string "print the title first and then comma and then first letter of initial name.
public class Que2 {
	String Gender="Male";
public static String IdentityofPerson(  String Gender) 
   {
	if(Gender=="Male") 
	  {
		return "Mr,";
	  }
	else
	{
		return"Ms,";
	}

   }

public static char InitialOfName(String name) 
{
	return Character.toUpperCase(name.charAt(0));
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name= ");
String name=sc.next();
System.out.println("Enter Gender= ");
String Gender=sc.next();

System.out.println(IdentityofPerson(Gender)+InitialOfName(name));

	
	
	
	
	
	}

}
