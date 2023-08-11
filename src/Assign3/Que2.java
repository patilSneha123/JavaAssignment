package Assign3;

import java.util.Scanner;

/*Given array of intergers,print the sum of elements sqaring/cubing as per the power of their indices.         
//answer=  sum=sum+a[i]^i;
   eg:input:{2,3,5}
	Output:29*/

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter total Element");
int n=sc.nextInt();
int sum=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}

	for(int i=0;i<n;i++)
	{
		a[i]=(int)Math.pow(a[i], i);
		
	
	
	System.out.println(a[i]);
	sum=sum+a[i];
	//System.out.println(sum);
	}
	System.out.println("Sum is="+sum);
	
	}

}
