package Assign2;

/*String encrption. replace the odd-index character with next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.
*/
import java.util.Scanner;

public class que81 {

	public static void encrypt(String s)
	{
		int count=0;
		char c[]=s.toCharArray();
		
		for(char c1:c)//The Array elements of c Stored into c1
		{
			if(count%2!=0)//if count=1,count=3 and so on
			c1=(char)(c1+1);
			//System.out.print(c1);
			else 
			{
				c1=(char)c1;//if count=0,count=2 and so on
			}
		
		count++;//increment count by1
		System.out.print(c1);//on console we get new String
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input1=");
	String input=sc.next();
	encrypt(input);
	}

}
