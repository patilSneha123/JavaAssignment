package Assign2;

import java.util.Scanner;

//Retrieve the max from array which is in a odd-index

public class Que9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the number of Element");
	int c=sc.nextInt();
	int a[]=new int[c];
	int max=a[0];
	System.out.println("Enter All the Element");
	for(int i=0;i<c;i++)
	{
		a[i]=sc.nextInt();//11 13 15 17 19
	}                     //0  1  2  3  4
	
	
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{                            //a[1]   a[3]
				System.out.println(a[i]);//13     17
				if(a[i]>max)//13>0      17>13 
					max=a[i];//max=13   max=17
			}
		}
		System.out.println("The maximum value is="+max);
		
		
	}

}
