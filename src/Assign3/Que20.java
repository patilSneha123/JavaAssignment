package Assign3;

import java.util.Scanner;

/*20)Square root calculation of
((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
o/p should be rounded of to int;
*/
public class Que20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter input");
System.out.print("Enter The valu of x1=");
int x1=sc.nextInt();
System.out.print("Enter The valu of x2=");
int x2=sc.nextInt();
System.out.print("Enter The valu of y1=");
int y1=sc.nextInt();
System.out.print("Enter The valu of y2=");
int y2=sc.nextInt();
int cal;
int mul1;
int mul2;
int sum1=x1+x2;
mul1=sum1*sum1;
int sum2=y1+y2;
mul2=sum2*sum2;
int sum=mul1+mul2;
System.out.println(sum);
System.out.println("Sqauare Root of Number is "+Math.sqrt(sum));
	}

}
