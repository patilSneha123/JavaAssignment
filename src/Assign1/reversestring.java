/*Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c*/

package Assign1;

import java.util.Scanner;

public class reversestring {
	
	  public static String reversedAndParsedString(String input) 
	  {
		  StringBuffer sb=new StringBuffer(input);
		  sb.reverse();
		  StringBuffer sb1=new StringBuffer(input); 
		  for(int i=0;i<(2*input.length())-1;i++)
			  if(i%2!=0)
	           sb1=sb.insert(i, '-');
		  //System.out.println(sb1);
	   return sb1.toString();
	   }
	 
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input="computer"; 
		  System.out.println(reversedAndParsedString(input));
		 

	
	}
}