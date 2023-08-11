/*Get a integer array as input. Find the average of the elements which are in the position of prime index
input:{1,2,3,4,5,6,7,8,9,10}
logic:3+4+6+8(the indeces are prime numbers)
output:21*/

package Assign1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageofPrimePositionIndex {

	public static double display(int n, int a[])
	{
		int count=0,sum=0,n1=0,d=0;
		int count1=0;
		double avg=0;
		for (int i=2;i<n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
		if(count ==2) {
			sum=sum+a[i];
			count1++;
		}
		
		
		}
		System.out.println("Sum is =" +sum);
	avg=(double)(sum)/count1;
	System.out.println("Average is="+avg);
	
	return avg;
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of input=");
int n=sc.nextInt();
System.out.print("Enter The element of Input");
int a[]=new int[n];

for(int i=0;i<n;i++) 
{
	a[i]=sc.nextInt();

}
System.out.println(display(n,a));	
}
    

  
	}



