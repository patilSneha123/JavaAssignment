package Assign3;

/*5)Given an array find the largest 'span'(span is the number of elements between two same digits)
find their sum.
a[]={1,4,2,1,4,1,5}
Largest span=5*/

public class Que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,2,1,4,1,5};
int n=0;
int max=0;
int b = 0;
int c=0;
int sum=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length-1;j++)
	{
		if(a[i]==a[j]) //1=4,1=2,1=1,
	  {
		    n=j;// 3 5 4 5
		    if(n-1>max)//5-1>4 5-1>4
		  {
			max=n-1;//max=4 
			b=i;//0 0
			c=n;//3 5
			
		  }
	   }
		
	}
}
System.out.println("Largest Span is="+(c-b));
for(int i=b;i<=c;i++)
{
	 sum=sum+a[i];
	
}
System.out.println(sum);
	}

}
