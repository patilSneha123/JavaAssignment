package Assign3;

/*4)int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.*/

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {12,14,2,26,35};
int max=a[0] ;
int min=a[0];

int k = 0;
for(int i=0;i<a.length;i++)//For Getting maximum value
{
	if(a[i]>max) 
	{
		max=a[i];
		
	}
}

for(int j=0;j<a.length;j++)//for getting Minimum value
{
	if(a[j]<min) 
	{
		min=a[j];
	}

}
System.out.println("Maximum Value is="+max);
System.out.println("Minimum Value is="+min);

System.out.println("Difference Between Max and Min is="+(max-min));
	}

}
