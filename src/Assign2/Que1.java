package Assign2;

//21.  Find the number of days between two input dates.

public class Que1 {
	static int input1Day=0,
	        input1Month=0,
	        input1Year=0;
	
	static int input2Day=0,
            input2Month=0,
           input2Year=0;

	static int DiffbetDayBy;
	
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
	
public static void DiffDayBy() 
{
	if((input1Day-input2Day)>0) {
		DiffbetDayBy=input1Day-input2Day;
	}
	else
	{
		DiffbetDayBy=input2Day-input1Day;
		increment=false;

	}
	
}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
    String input1="12/03/2023";
    String input2="19/04/2023";
    		
	
	
    input1getDayMonthYear(input1);
	System.out.println(input1Day+" "+input1Month+" "+input1Year);

	input2getDayMonthYear(input2);
System.out.println(input2Day+" "+input2Month+" "+input2Year);

DiffDayBy();
System.out.println("Output is= "+DiffbetDayBy);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
