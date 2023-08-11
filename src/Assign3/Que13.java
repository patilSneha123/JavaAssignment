package Assign3;

/*13)Take the word with a max length in the given sentance
in that check for vowels if so count the no.of occurances !
 Input 1="Bhavane is a good girl"
 Output =3
 Input 1="Bhavanee is a good girl"
 Output =4*/


public class Que13 {
	public static void Vowel(String s)
	{
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='A')
				counta++;
			if(s.charAt(i)=='e' || s.charAt(i)=='E')
				counte++;
			if(s.charAt(i)=='i' || s.charAt(i)=='i')
				counti++;
			if(s.charAt(i)=='o' || s.charAt(i)=='o')
				counto++;
			if(s.charAt(i)=='u' || s.charAt(i)=='u')
				countu++;
		
		
		}
		
		count=counta+counte+counti+counto+countu;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Input="Bhavanee is a good girl";
Input=Input+" ";
String word=" ";
String max=" ";
for(int i=0;i<Input.length();i++)
{
	char ch=Input.charAt(i);
	if(ch!=' ')
	{
	   word=word+ch;
	}
	else 
	{
	      if(word.length()>max.length())
	           {
		          max=word;
	            }
	
	word="";
	
	
	}
}
System.out.println("Maximum length of word is= "+max);
//System.out.println(max.length());
Vowel(max);






	}

}
