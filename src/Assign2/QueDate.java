package Assign2;

import java.util.Scanner;

public class QueDate {
static int n;
	public static  boolean LeapYear(int year)
	{
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			return true;
		}else
			return false;
	}
	
	public static int NumberofdaysinMonth(int month,int year) 
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		     {
			return 31;
		      }
	if(month==4||month==6||month==11)
	         {
		      return 30;
	         }
	if(month==2) 
	{
		boolean n= LeapYear(year);
		if(n==true) 
		      {
			   return 29;
		      }
		else
			return 28;
		
	}
	return year;
	
	}
	
	public static int differBetdates( int day1,int month1,int year1,int day2,int month2,int year2) 
	  //IF Day,Month And Year is same
	{
		if(year1==year2)
		{
			if(month1==month2)
			{
				if(day1==day2) 
				{
					return 0;
				}
				   else 
				   {
					return(day1-day2);
				   }
		     }
				else if(month1<month2)
				{
					int result=0;
					for(int i=month1;i<month2;i++) 
					{
						result=result+NumberofdaysinMonth(i,year1);
					}
					   if(day1==day2)
						   return result;
					   else if(day1<day2)
					   {
						   result=result+(day2-day1);
						   return result;
					   }
					   else {
						   result=result-(day1-day2);
						   return result;
					         }
				}
					   else
					   { 
						   int result=0;
						   for(int i=month2;i<month1;i++) 
							{
								result=result+NumberofdaysinMonth(i,year1);
							}
							   if(day1==day2)
								   return result;
							   else if(day2<day1)
							   {
								   result=result+(day1-day2);
								   return result;
							   }
							   else {
								   result=result-(day2-day1);
								   return result;
							         }
					
		                  }
	    }else if(year1<year2) 
	    {
	    	int yrdays=0;
	    	for(int i=year1;i<year2;i++) 
	    	{
	    		if( LeapYear(i))
	    			yrdays=yrdays+366;
	    		else
	    			yrdays=yrdays+365;
	    	}
	    if(month1==month2)
	    {
	    	if(day1==day2)
	    		return yrdays;
	    	else if(day1<day2)
	    		return yrdays+(day2-day1);
	    	else
	    		return yrdays-(day1-day2);
	    }
	    else if(month1<month2)
	    {
	    	int result=0;
	    
	    for(int i=month1;i<month2;i++)
	    {
	    	result=result+NumberofdaysinMonth(i,year2);
	    }
	    if(day1==day2)
	    	return yrdays+result;
	    else if(day1<day2) 
	    {
	    	result=result+(day2-day1);
	    	return yrdays+result;
	    }
	    else
	    {
	    	result=result-(day1-day2);
	    	return yrdays+result;
	    }
	    }
	    else
	    {
	    	int result=0;
	    	for(int i=month2;i<month1;i++) 
	    	    {
	    		result=result+NumberofdaysinMonth(i,year2);
	    		}
	    	if(day1==day2)
	    		return yrdays+result;
	    	else if(day2<day1)
	    	{
	    		result=result+(day1-day2);
	    		return yrdays-result;
	    	}
	    	
	    	else
	    	{
	    		result=result-(day2-day1);
	    		return yrdays-result;
	    	}
	    }
	    }
	    else if(year1>year2) 
	    {
	    	int yrdays=0;
	    	for(int i=year2;i<year1;i++) 
	    	{
	    		if( LeapYear(i))
	    			yrdays=yrdays+366;
	    		else
	    			yrdays=yrdays+365;
	    	}
	    if(month1==month2)
	    {
	    	if(day1==day2)
	    		return yrdays;
	    	else if(day2<day1)
	    		return yrdays+(day1-day2);
	    	else
	    		return yrdays-(day2-day1);
	    }
	    else if(month2<month1)
	    {
	    	int result=0;
	    
	    for(int i=month2;i<month1;i++)
	    {
	    	result=result+NumberofdaysinMonth(i,year1);
	    }
	    if(day1==day2)
	    	return yrdays+result;
	    else if(day1<day2) 
	    {
	    	result=result+(day2-day1);
	    	return yrdays+result;
	    }
	    else
	    {
	    	result=result-(day1-day2);
	    	return yrdays+result;
	    }}
	    else
	    {
	    	int result=0;
	    	for(int i=month1;i<month2;i++) 
	    	    {
	    		result=result+NumberofdaysinMonth(i,year1);
	    		}
	    	if(day1==day2)
	    		return yrdays-result;
	    	else if(day1<day2) {
	    		result=result+(day2-day1);
	    		return yrdays-result;
	    	}
	    	
	    	else
	    	{
	    		result=result-(day1-day2);
	    		return yrdays-result;
	    	}
	   
	}  
	    
	    }
		return 0;   
	    
	    
	  
	    
	    
	    
	    
	    
 }
		
 public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Day1= ");
int day1=sc.nextInt();
System.out.println("Enter Month1= ");
int Month1=sc.nextInt();
System.out.println("Enter Year1= ");

NumberofdaysinMonth( Month1,Month1) ;


int Year1=sc.nextInt();
System.out.println("Enter day2= ");
int day2=sc.nextInt();
System.out.println("Enter Month2= ");
int Month2=sc.nextInt();
System.out.println("Enter Year2= ");
int Year2=sc.nextInt();
	
 
NumberofdaysinMonth(Month2,Year2);
 
 int diff= differBetdates( day1, Month1, Year1,day2, Month2, Year2);
 System.out.println(diff);
 
 }

}
