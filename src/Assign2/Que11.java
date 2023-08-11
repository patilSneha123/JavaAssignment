package Assign2;

/*input1="Rajasthan";
input2=2;
input3=5;
output=hts;*/

public class Que11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Input1="Rajasthan";
int Input2=2;
int Input3=5;	
StringBuffer sb=new StringBuffer(Input1);	
//sb.reverse();
System.out.println(sb.reverse().substring(Input2, Input3));
	}

}
