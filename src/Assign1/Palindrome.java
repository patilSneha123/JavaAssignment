package Assign1;

/*Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)*/


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value ="maeam";
		String reversevalue="";
		int counta =0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
	

	for(int t=value.length()-1;t>=0;t--)
	{
		
		if(value.charAt(t) == 'a' || value.charAt(t) == 'A')
			counta ++;
		if(value.charAt(t) == 'e' || value.charAt(t) == 'E')
			counte ++;
		if(value.charAt(t) == 'i'||value.charAt(t) == 'I')
			counti ++;
		if(value.charAt(t) == 'o'||value.charAt(t) == 'O')
			counto ++;
		if(value.charAt(t) == 'u'||value.charAt(t) == 'U')
			countu ++;
	
		reversevalue=reversevalue + value.charAt(t);
		System.err.println(reversevalue);
	}
	
	if(counta>1 == counte>1 == counti>1 == counto>1 == countu>1) {

		System.out.println("false(no 2 diff vowels)");
	}
	else
	{
		if (counta>1 || counte>1 || counti>1 || counto>1 || countu>1)
		System.out.println("different Vowel found" );
		
	}
			if(value.equals(reversevalue))
			{
				System.out.println("Given string is Palindrom");
			}
			else 
			{
				System.out.println("Given string is not Palindrom");
			}

		//System.out.println("false(no 2 diff vowels) " + count);
	
	}

}
