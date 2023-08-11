package Assign2;

/*input1=commitment;
output=cmmitmnt;
c be the first index position 
remove even vowels from the string*/

public class Que12 {

	public static String EvenVowel(String s)
	{
		StringBuffer sb=new StringBuffer();//It is mutable.allowing you to modify the contents of a string without creating a new object every time.

		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
				sb.append(s.charAt(i));//The append() method is used to add characters, strings, or other objects to the end of the buffer.
			else if(i%2!=0)
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
			
			if(s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')

		sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="commitment";
System.out.println(EvenVowel(input));
}

	}

	
	


