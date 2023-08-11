package Assign3;

/*14)for the given string display the middle 2 value, case satisfies only if string is of even length
ip - java
op - av*/

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Input="java";
	int l=Input.length();
	int M=0;
	if(l%2==0)
	{
		M=l/2;// 6/2=3
		int f=M-1; // 2
		System.out.println(String.valueOf(Input.charAt(f))+String.valueOf(Input.charAt(M)));
	}                                          //2 =v        +  3=a
	
	else
	{
		System.out.println("Case is not satisfy");
	}
	
	
	
	
	}

}
