package Assign1;

/*Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class date {
	public String date(int day,int month,int year) {
Calendar c=Calendar.getInstance();//This method is used with calendar object to get the instance of calendar according to current time zone set by java Runtime environment.27
c.set(year, month-1, day);

//String Array of Days of week
String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","friday","Saturday","Sunday"};
int n;
n=c.get(c.DAY_OF_WEEK);//It returns an integer from 1 to 7 day
return (days[n-1]);
}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in); 
	String str;
	System.out.println("Enter the date(dd/mm/yyyy)");
	str=sc.nextLine();                   //begin Index,End Index   
	int day=Integer.parseInt(str.substring(0, 2));//subString is convert it into Integer value 
	int Month=Integer.parseInt(str.substring(3, 5));//subString is convert it into Integer value 
	int Year=Integer.parseInt(str.substring(6, 10));//subString is convert it into Integer value 
date d=new date();
System.out.println(d.date(day, Month, Year));
	
	
	
	}
}


