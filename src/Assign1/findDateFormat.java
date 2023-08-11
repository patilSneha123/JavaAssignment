package Assign1;

import java.util.Scanner;

/*accept a string and find if it is of date format "dd/mm/yyyy".
input:01/13/2012
output:false*/
public class findDateFormat {
public static void isValidMonth(int dd,int mm,int yyyy) {

	if(dd < 1 || mm < 1 || yyyy < 1 || mm > 12)
	{
		System.out.println( "False ");
	}
	else {
		System.out.println("True");
	}
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int dd=0;
	int mm=0;
	int yyyy=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date(dd/mm/yyyy)");
	String input=sc.nextLine();
	String a[]=input.split("/");
	 findDateFormat fd=new  findDateFormat();
	
	dd=Integer.parseInt(a[0]);
	mm=Integer.parseInt(a[1]);
	yyyy=Integer.parseInt(a[2]);
	
fd.isValidMonth(dd, mm, yyyy);

	
	}

}
