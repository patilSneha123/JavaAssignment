/*Given date in dd-MM-yyyy format.return the month in full name format(January)
input:"23-01-2012"
output:January*/

package Assign1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Monthname {
	public static void getMonth(String date) 
	{
		LocalDate currentDate= LocalDate.parse(date);//LocalDate class to get the day, month, and year from the date
		Month month=currentDate.getMonth();//method returns the month represented by the given date
	System.out.println("Month is= "+month);
	} 
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*
		 * String date="2012-09-23"; getMonth(date);
		 */
		  
		 
			
			  Scanner sc=new Scanner(System.in);
			   String date;
			  System.out.println("Enter date in yyyy-mm-dd"); 
			  date=sc.nextLine();
			  getMonth(date);
			 
	
	}}
