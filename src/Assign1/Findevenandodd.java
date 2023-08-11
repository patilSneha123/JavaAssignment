/*A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1*/
package Assign1;

import java.util.Scanner;

public class Findevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number");
num=sc.nextInt();
int ecount = 0;
int ocount = 0;
int oadd;
int oddsum = 0;
while(num>0)
{
	int rem= (int) (num%10);
	
	if(rem%2==0)
	{
	
	ecount++;
	
     }
	else
	{
		
	    oddsum = oddsum + rem; 
		System.out.println("odd digit is=" +rem);
		System.out.println("odd Sum=" +oddsum);
		ocount++;
		if(oddsum%2==0) {
			System.out.println("-1");
		}
			else 
			{
				System.out.println("1");
			}
		}
	
	
num=num/10;

}
System.out.println("Total even number are="+ecount);
System.out.println("Total odd Number are="+ocount);


	
}
}