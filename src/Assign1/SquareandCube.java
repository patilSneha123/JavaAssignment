 /*Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2*/


package Assign1;

public class SquareandCube { 

public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareandCube sc=new SquareandCube ();
int input[]= {1,2,3,4};
int input1[]=new int[input.length];
int sum=0;
for(int i=0;i<input.length;i++)
{
		    if(input[i]%2==0) 
	    {
           input[i]=(int)Math.pow(input[i], 2);
         }
	     else {
	    
		    input[i]=(int)Math.pow(input[i], 3);
	      }

	
		  System.out.println(input[i]);
		  sum=sum+input[i];
}
System.out.println("Result is=" +sum);
}
}