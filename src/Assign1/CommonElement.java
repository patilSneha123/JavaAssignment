/* Get two integer arrays as input. Find if there are common 
 * elements in the arrays. find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4)*/

package Assign1;

import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int input1[]= {1,2,3,4};
	int input2[]= {3,4,5,6};
	int com [] = new int [4] ;
	int count=0;
    
	for( int i=0;i<input1.length;i++)
	{
		//int count=0;
		
		for (int j=0;j<input2.length;j++) 
		{
			
		    if(input1[i]==input2[j])
		    
		    {
		         com[i] =input1[i];
				  System.out.print(com[i]+" "); 

					  com[j]=input2[j];
					  
					  System.out.print(com[j]+" "); 
					  count=com.length;
					 
		    }
		    
		   
		}
		
	
		
//System.out.println(input1[i]);
	}
	System.out.println("count is= "+count);
	

	}
}	

		
		
		
		
		
		
		
		
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("input1= "); int
		 * input1[]=new int[4]; int i; for( i=0;i<input1.length;i++) {
		 * input1[i]=sc.nextInt(); System.out.print(input1[i]+ " "); }
		 * 
		 * System.out.println("input2= "); int input2[]=new int [4]; for(
		 * i=0;i<input1.length;i++) { input2[i]=sc.nextInt();
		 * System.out.print(input2[i]+" ");
		 * 
		 * } if(input1[i]==input2[i]) { System.out.println(input1[i]); }
		 */
/*
 * if (input1[i]==input2[i]) { System.out.println(input1[i]);
 * 
 * }
 */
/*
 * int common[]=new int[4]; int k; for(k=0;k<input1.length;k++) {
 * if(input1[k]==input2[k]) { common[k]=input1[k];
 * System.out.println(common[k]);
 * 
 * } }
 */


	


