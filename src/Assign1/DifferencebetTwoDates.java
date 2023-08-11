/*Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11
*/
package Assign1;

/*import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;*/

public class DifferencebetTwoDates {

	/*
	 * public static int monthDiff(String s1,String s2) throws ParseException {
	 * SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); Calendar
	 * c=Calendar.getInstance(); Date d1=sdf.parse(s1); Date d2=sdf.parse(s2);
	 * c.setTime(d1);//sets Date Object int m1=c.get(Calendar.MONTH); int
	 * y1=c.get(Calendar.YEAR); c.setTime(d2); int m2=c.get(Calendar.MONTH); int
	 * y2=c.get(Calendar.YEAR); int n=(y1-y2)*12+(m1-m2); return n; }
	 */
	
	
	static int input1Day=0,
	        input1Month=0,
	        input1Year=0;
	
	static int input2Day=0,
            input2Month=0,
           input2Year=0;

	static int DiffbetMonthBy;
	
	static boolean increment= true;
	
	
	private static void input1getDayMonthYear(String datestring) {
		
		int firstIndex=datestring.indexOf("/");
		int lastIndex=datestring.lastIndexOf("/");
		
		String day=	datestring.substring(0, firstIndex);
	
		//convert String to int
        input1Day=Integer.parseInt(day);
		
		String month=datestring.substring(firstIndex+1, lastIndex);
		
		 input1Month=Integer.parseInt(month);
		
		String year=datestring.substring(lastIndex+1,datestring.length());
		input1Year=Integer.parseInt(year);
	
		
	}
	
	
private static void input2getDayMonthYear(String datestring) {
		
		int firstIndex=datestring.indexOf("/");
		int lastIndex=datestring.lastIndexOf("/");
		
		String day=	datestring.substring(0, firstIndex);
	
		//convert String to int
       input2Day=Integer.parseInt(day);
		
		String month=datestring.substring(firstIndex+1, lastIndex);
		
		 input2Month=Integer.parseInt(month);
		
		String year=datestring.substring(lastIndex+1,datestring.length());
		input2Year=Integer.parseInt(year);
	
		
	}
	
public static void DiffMonthBy() 
{
	if((input1Month-input2Month)>0) {
		DiffbetMonthBy=input1Month-input2Month;
	}
	else
	{
		DiffbetMonthBy=input2Month-input1Month;
		increment=false;

	}
	
}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String input1="01/12/2012"; 
		String input2="03/01/2012"; 

		
		input1getDayMonthYear(input1);
		System.out.println(input1Day+" "+input1Month+" "+input1Year);
	
		input2getDayMonthYear(input2);
	System.out.println(input2Day+" "+input2Month+" "+input2Year);
	
	DiffMonthBy();
	System.out.println("Output is= "+DiffbetMonthBy);
	
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String s1=new String("2012-10-01"); String s2=new String("2012-06-03");
		 * System.out.println(monthDiff(s1,s2));
		 */	
	}

}
