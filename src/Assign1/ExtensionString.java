/*Find the extension of a given string file.
input: "hello.jpeg"
output: "jpeg"*/
/*String Tokenizer -break String into Token
*/


package Assign1;

import java.util.StringTokenizer;

public class ExtensionString {
	public static String extensionString(String s1) {
	StringTokenizer t=new StringTokenizer(s1,".");	//StringTokenizer class in Java is used to break a string into tokens.
		t.nextToken();//return next token from this string tokenizer
		String s2=t.nextToken();
	return s2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello.jpeg";		
		System.out.println( extensionString( s1));
	

	}

}
