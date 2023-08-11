package Assign1;
/*Sum of fibonaaci series upto given input.
sum of first 3 
logic:1+1+2
output:4*/

import java.util.Scanner;

public class FebanaaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int num1 = 0; 
				int num2 = 1;
				int num3 = 0;
				int sum = 0;
		 Scanner sc=new Scanner(System.in); 
		   System.out.println(("Enter Maximum Number for Fibonacci Series = "));

		 int n=sc.nextInt();
		   //System.out.println(First+ "+" +Second);
		 
		   for( int i=0;i<n;i++)
		   {
		     System.out.println(num1);
		      sum = sum + num1;//0 1
		      num3 = num1 + num2;//1
		      num1 = num2;//1 1
		      num2 = num3;//1
		   }
		   System.out.println(("The Sum of Fibonacci Series Numbers " +sum));
		}

		
	
	
	
	
	
	
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("how many number is printed= "); 
		 * int n=sc.nextInt(); 
		 * int sum=0; int num; int num1=0; int num2=1;
		 *  System.out.print(num1+ "+" +num2);
		 * for(int i=2;i<n;i++) 
		 * {
		 *  num=num1+num2;//0+1=1,1+1=2,1+2=3 
		 *  System.out.print("+" +num ); 
		 *  sum=sum+num; 
		 *  num1=num2;//=1,=1 
		 *  num2=num;//=1,=2 }
		 * 
		 * 
		 * System.out.println(sum);
		 */
	}
		
		


