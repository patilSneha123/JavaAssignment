/*Two input strings are accepted. If the two strings are of same length concat them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello"
input2:"Hi"
output:"llohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"*/

package Assign1;

import java.util.Scanner;

public class concatString 
{
	public  String concat(String input1,String input2) {
		System.out.println(input1+input2);
		return input1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("input1=");
String input1=sc.next();
System.out.print("input2=");
String input2=sc.next();
concatString s=new concatString();
if(input1.length()==input2.length()) 
      {
          s.concat(input1, input2);
      }
          else
          {
        	     // ex - (Hello (length 5)) - (Hi (Length 2))
				// Diff 3-->	Reduce first 3 char form string input1
        	  s.concat(input1.substring(input1.length() - input2.length()),input2);
        	   						
        	 
          }
				
          
          }
      
      }
      
	
      
      
        
    	  
      
      
      
      
      
	













/*
 * if(input1.length()==input2.length()) { System.out.println(input1+input2); }
 * else { if(input1.length()!=input2.length()) { for(input1.charAt(i ))
 * 
 * } }
 */


/*
 * for(int i=0;i<input1.length();i++) { for (int j=0;j<input2.length();j++) {
 * if(input1.charAt(i)==input2.charAt(j)) { System.out.println(input1+input2);
 * //System.out.println(input1.charAt(i)+input2.charAt(j)); } } }
 */
	//if(input1.charAt(0))
	
	
	
	
	
	


