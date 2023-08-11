package Assign2;

import java.util.Scanner;


//Return the number of days in a month, where month and year are given as input.

public class Que14 {
	public static void LeapYear(int Year,int Month)
	{
		if(Year%400==0||(Year%100!=0)&&(Year%4==0))
		{
			System.out.println("This is Leap Year ");
			if((Month==2))
			{
				System.out.println("number of days is 29");
				
			}
			
			else if((Month==1)||(Month==3)||(Month==5)||(Month==7)||(Month==8)||(Month==10)||(Month==12))
				{
				System.out.println("Number of Days 31");
				}

			else if((Month==4)||(Month==6)||(Month==9)||(Month==11))

			{
				System.out.println("Number of days 30");
			}
			else 
			{
				System.out.println("Wrong input Credentials");
			}
	    }
		else {
			System.out.println("This is not Leap year");
			if((Month==2))
			{
				System.out.println("number of days is 28");
				
			}
			
			else if((Month==1)||(Month==3)||(Month==5)||(Month==7)||(Month==8)||(Month==10)||(Month==12))
				{
				System.out.println("Number of Days 31");
				}

			else if((Month==4)||(Month==6)||(Month==9)||(Month==11))

			{
				System.out.println("Number of days 30");
			}
			else 
			{
				System.out.println("Wrong input Credentials");
			}
		}
		
		
		
		
		
		}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" Year is ");
int Year=sc.nextInt();

System.out.println("Month is");
int Month=sc.nextInt();

LeapYear( Year, Month);



	}

}
