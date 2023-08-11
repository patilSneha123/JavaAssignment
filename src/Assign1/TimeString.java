package Assign1;



/*A time input is received as stirng. 
 * Find if the hour format is in 12 hour format.
 *  the suffix am/pm is case insensitive.
input:"09:36 am"
output:true*/

public class TimeString {
	
	
	  public static void hourFormat( int a,int b) 
	  { 
		  if(a<=12 && b<=59  ) 
		  {
	             System.out.println("True"); 
	       } 
		  else 
		  { 
			  System.out.println("False"); 
		  } 
		  
	  }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="13:36 am";
String abc[] = input.toUpperCase().split(":");
System.out.println(abc[0]);
int a=Integer.parseInt(abc[0]);

String abc1[] =abc[1].split(" ");
System.out.println(abc1[0]);
int b=Integer.parseInt(abc1[0]);

/*
 * String abc2[]=abc1[1].split(" "); System.out.println(abc2[0]); int
 * c=Integer.parseInt(abc2[0]);
 */
hourFormat(13,36);
	
	
	}

}
