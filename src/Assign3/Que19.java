package Assign3;



/*19)Email Validation
String input1="test@gmail.com"
             1)@ & . should be present;
             2)@ & . should not be repeated;
             3)there should be five charcters between @ and .;
             4)there should be atleast 3 characters before @ ;
             5)the end of mail id should be .com;*/

public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="test@gmail.com";
		
		  int count=0; 
		  int count1=0;
		  String end_var=".com";
		  String word[]=input.split("@");

		  String s1=word[0]; 
		  String s2=word[1]; 
		  
		  
		  System.out.println(s1); 
		  System.out.println(s2); 
		 
		
		  if(input.contains("@")&&input.contains(".")&&input.contains(end_var)) 
		  {
			  count++; 
			  if(count==1) 
			  { 
				  if(s1.length()>3 && s2.length()==9) 
					 
				  {
					 count1++;
					 
				  }
					  
			  }
		  
		  }
		  if(count1==1)
		  {
			  System.out.println("Valid Email");
		  }
		  else
		 System.out.println("Invalid Email");
	}

}
