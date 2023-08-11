package Assign3;

/*15) Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
if both the sum is equal return 1 or return -1.*/

public class Que15a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int sumo = 0;
int sume = 0;

for(int i=0;i<a.length;i++)
{
	if(i==0)
	{
		continue;
	}
	if(i%2==0)
	{
		sume=sume+a[i];
	}
	else
	{
		sumo=sumo+a[i];
	}

}
System.out.println("Even index sum is"+sume);
System.out.println("odd index sum is"+sumo);
	if(sume==sumo)
	{
		System.out.println("Return 1");
	}
	else
		System.out.println("Return -1");
	
	
	}

}
