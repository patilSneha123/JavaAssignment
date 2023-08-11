package Assign3;

/*17)Find the sum of the numbers in the given input string array
Input{“2AA”,”12”,”ABC”,”c1a”)
Output:6 (2+1+2+1)
Note in the above array 12 must not considered as such
i.e,it must be considered as 1,2
*/	

public class Que17 {

	public static void main(String[] args) 
	{
          String Input[]= {"2AA","12","ABC","c1a"};
          int sum=0;
          for(int i=0;i<Input.length;i++)//loop for whole input element in array
          {
        	for(int j=0;j<Input[i].length();j++)//loop for inner separate separate String
        	{
        		char ch=Input[i].charAt(j);//all the character from the element of Input Stored in ch
        		if(Character.isDigit(ch))//checking given char is digit or not
        		{
        			String k=String.valueOf(ch);//if char=digit then that char element Stored in into k
                    int num=Integer.parseInt(k);//char are converted it into Integer and stored in num
        			sum=sum+num;//Addition of all Integer value
        		}
        	}
          }
          
          System.out.println(sum);
	
	
	
	
	}

}
