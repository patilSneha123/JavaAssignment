package Assign2;
//Retrieve the elements in a array, which is an input, which are greater 
//than a specific input number. Add them and find the reverse of the sum.

import java.util.Scanner;

public class Que15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of element");
	int n=sc.nextInt();
	System.out.println("Enter Array Element");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
	System.out.println("Enter input");
	int b=sc.nextInt();
	int max=0;
	int i=0;
	int sum = 0;
	for( i=0;i<a.length;i++)
	{
		if(a[i]>b && a[i]!=b  )
		{
			max=a[i];
	        sum=sum+max;
		}
	
	}
	System.out.println(sum);
	
	//System.out.println(rev);
	
	
	  int num=sum; 
	  int rev = 0; 
	  System.out.println("sum is="+(num));
	  for(;num!=0;num/=10)
	  {
		  int rem=num%10;
		  rev=rev*10+rem;
		  
		  
	  }
		
	  
	  System.out.println(rev);
	 
	 
	}}

