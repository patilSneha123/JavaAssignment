package Assign2;

import java.util.Scanner;

// Write a Program that accepts a string and removes the duplicate characters.

public class Que3 {
	
	
	  public static String duplicateChar(String st)
	  {  
		  
		  String st1=" ";
	  
	      for(int i=0;i<st.length();i++) 
	        {                         //i=0  i=1  i=2  i=3  i=4
		      char ch=st.charAt(i);   //n    a     y   a    n //(a,n)already present in string
	          if(st1.indexOf(ch)==-1) //if subString is not found or match is not found
	             {                      //if the character does not occure in string
		            st1=st1+ch; //All ch value stored in st1
		         }
	  
	        }
	  
	  return st1;
	  
	  }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String st=sc.next();
System.out.println(duplicateChar(st));
	
     }

}
