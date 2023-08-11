package Assign2;

import java.util.Scanner;

//find the average of the maximum and minimum number in an integer array

public class Que5 {

	public static int max(int[] array)
	{
		int max=0;
		for(int i=0;i<array.length;i++)//0  1  2  3  4  
		{                              //23 34 45 23 56
			if(array[i]>max)//23>0  34>23   45>34 45>23    45>56
			{
				max=array[i];//max=23 max=34 max=45 max=45 max=56
			}//max=56
			
		}
		return max;
	}
	
	public static int min(int[] array)
	{
		int min=array[0];
		for(int i=0;i<array.length;i++)//0  1  2  3  4 
		{                              //23 34 45 23 56
			if(array[i]<min)//23<23  34<23  45<23 23<23
			{                                     //cond.false
				min=array[i];//min=23 23  23 23
			}//min=23;
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of Array= ");//5
int n=sc.nextInt();
int num[]=new int[n];

     for(int i=0;i<num.length;i++) 
         {
	         num[i]=sc.nextInt();//23,34,45,23,56
	         
         }
     System.out.println("Maximum Integer is= "+max(num));//56
     System.out.println("Maximum Integer is= "+min(num));//23

     int a=max(num);//56
     int b=min(num);//23
     int sum=a+b;
     float avg=sum/2;
     System.out.println("The average of the maximum and minimum number in an integer array is= " +avg);

	}

}
