package Assign3;

/*String Buffer=A string buffer is like a String , 
but can be modified. At any point in time it contains 
some particular sequence of characters, 
but the length and content of the sequence can be changed through 
certain method calls.*/

import java.util.Scanner;

/*12)String a="a very fine day"
output:A Very Fine Day
*/
public class Que12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Input="a very fine day";

  StringBuffer sb=new StringBuffer();
  
  String[] s=Input.split(" "); // 
  for(String s1:s) //s1=a  very  fine  day
  { 
	  char[]s2=s1.trim().toCharArray();//v,e,r,y
	  s2[0]=Character.toUpperCase(s2[0]);//to Upper case V 
	  s1=new String(s2);//Very=v,e,r,y
  
  sb.append(s1).append(" ");
  
  }
  
  System.out.println(sb.toString().trim());
 	
	}

}
