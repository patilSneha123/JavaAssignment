/*.Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list. 
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}*/

package Assign1;

public class Arraylist {
	
	public static int[] retrievePosition(int input1[],int input2[]) {
	int input3[]=new int[input1.length];
	int i;
	for(i=0;i<input1.length;i++) {
		if(i%2==0)
			input3[i]=input2[i];//The array element of input2 stored into input3
		if(i%2!=0)
			input3[i]=input1[i];//The array element of input1 stored into input3
	}
	return input3;
	
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

int input1[]= {12,1,32,3};
int input2[]= {0,12,2,23};

int input3[]=retrievePosition(input1,input2);
for(int a:input3)//the Array Element input3 Stored into a
	
	System.out.print(a);
	
	
	
	}

}
