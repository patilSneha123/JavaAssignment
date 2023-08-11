package Assign2;

import java.util.Scanner;

// Retrieve the odd-position digits from input integer array. Multiply them with their index and return their sum.

public class Que13 {
	public static int oddPosition(int a,int input[])
	{
		int sum = 0;
		int mul = 0;
		int i=0;
		for (i=0;i<a;i++)
		{
			if(i%2!=0)
			{
				 mul=input[i]*i;
				 System.out.println("Multiplication is=" +mul);
			
			sum=sum+mul;
			}
			//System.out.println(sum);
			
		}
		return sum;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total array Element");
	int a=sc.nextInt();
	int input[]=new int[a];
	System.out.println("Enter Array Element");
	for(int i=0;i<a;i++)
	{
		input[i]=sc.nextInt();
		
	}
	System.out.println(oddPosition( a, input));
	}

}
