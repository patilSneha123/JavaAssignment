package Assign3;
//10)What will be the DAY of current date in next year

import java.text.SimpleDateFormat;
import java.util.Date;

public class Que10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d=new Date();
		System.out.println(SameDayOnUpcomingYear(d));
		}
		
		public static String SameDayOnUpcomingYear(Date d)
		{
			Date d1=new Date();
			d1.setYear(d.getYear()+1);
			
		
		SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		String s=sdf.format(d1);
		return s;
		}
	}


