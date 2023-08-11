/*Find if a given pattern appears in both the input strings at same postions.
input1: "hh--ww--"
input2: "rt--er--"
output: true(false otherwise)
*/
package Assign1;

public class SamePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input1="hh--ww--";
String input2="--rt--er";

	if (input1.charAt(input1.length()-1)==input2.charAt(input2.length()-1))
	{
	System.out.println("True");
	}
	else {
		System.out.println("False");
	}	
	
	
	
	
	
	}

}
