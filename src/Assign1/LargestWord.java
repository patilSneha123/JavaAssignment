
/*find the max length-word in a given string and return the max-length word. if two words are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)*/

package Assign1;

public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello how are you aaaaa";
		input=input+"";
		String word = "", large = "";
int l=input.length();
int ll=0;
for(int i=0;i<l;i++) {
	char ch=input.charAt(i);
	if(ch!=' ')
	{
		word=word+ch;
	}
	else {
		if(word.length()>large.length()) {
			large=word;
			
		}
		word="";
	}
	
}
System.out.println("Longest word is="+large );		
	System.out.println(large.length());	
		
		
		
		
	}

}
