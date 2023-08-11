package Assign3;

/*7) arraylist1={ 1,2,3,4,5}
arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}*/


public class Que7 {
	public static int[] SameSize(int input1[],int input2[])
	{
		int input3[]=new int[input1.length];
		int i;
		for( i=0;i<input1.length;i++)
		{
			if(i%2==0)
			input3[i]=input2[i];
			if(i%2!=0)
				input3[i]=input1[i];
		}
		return input3;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arraylist1[]= {1,2,3,4,5};
int arraylist2[]= {6,7,8,9,10};	
  if(arraylist1.length==arraylist2.length)
  {
	  int input3[]=SameSize(arraylist1,arraylist2);
	  for(int a:input3)
		  System.out.print(a+" ");
  }
  else 
  {
	  System.out.println("Size is different");
  }
	}

}
