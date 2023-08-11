package Assign2;

import java.util.Scanner;
import java.util.StringTokenizer;

/*validate the ip address in the form a.b.c.d
where a,b,c,d must be between 0 and 255
if validated return 1 else return 2.
*/
public class Que6 {
	public static int validate(String ipAdress) 
	{
		StringTokenizer t=new StringTokenizer(ipAdress,".");//the string tokenizer class to break the string into tokens by using ‘.’ as a delimiter. 
		                                                    //Extract each token and store it in an integer variable a,b,c, and d.
		int a=Integer.parseInt(t.nextToken());
		int b=Integer.parseInt(t.nextToken());
		int c=Integer.parseInt(t.nextToken());
		int d=Integer.parseInt(t.nextToken());

	if((a>=0&&a<=255) && (b>=0&&b<=255) && (c>=0&&c<=255) && (d>=0&&d<=255))
		return 1;
	else
		return 2;
	
	
	
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter ip Address= ");
String ip=sc.nextLine();
System.out.println(validate(ip)); 
		
		
		
		
		
		
		
	}

}
