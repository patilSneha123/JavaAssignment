/*A integer array is given as input. find the difference between each element. Return the index of the largest element which has the largest difference gap.
		input: {2,3,4,2,3}
		logic: 2-3=1,3-4=1,4-2=2,2-3=1

*/
package Assign1;

import java.util.Scanner;

public class differenceofeachelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n,large,small; 
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the number of input"); 
		  n=sc.nextInt(); 
		 int a[]=new int[n]; 
		  System.out.print("Enter the element of input"); 
		  for(int i=0;i<n;i++)
		  { 
			  a[i]=sc.nextInt(); //All Array Element Stored in a[] 
			  } 
		  large =a[0]; 
		  small=a[0]; 
		  int k ;
		  int val =0 ;
		  for ( k=0;k<n;k++)   //0   1  2  3  4
		  {
			  if(a[k]>large) { //2   3  4  2  3
				  large=a[k];  //2     
				  val = k;     //0   1  2  3  4
				 
			  } 
		  
		  }
		  System.out.println( "Maximum value of index is=" + val);
		  for(int j=0;j<n;j++)//For getting Smaller Value
		  { if(a[j]<small) 
		  { 
			  small=a[j];
		  } }
		  
		
		 System.out.println("Maximum value is ="+large);
		  
		  System.out.println("Minimum value is ="+small); 
		  System.out.println("Maximun Difference="+(large-small) );
		 
	}
}
		 
		 
		 
		
		
	



