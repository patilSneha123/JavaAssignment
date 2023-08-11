package Assign2;

/*intput="xyzwabcd"
intput2=2;
input3=4;
output=bawz*/

public class Que19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String input="xyzwabcd";
	int input1=2;
    int input2=4;

	StringBuffer sb=new StringBuffer(input);
	//sb.reverse();
	//System.out.println(sb.reverse().substring(input1+1, input2+1));
	String s1=sb.reverse().substring(input1,input1+input2);
	//String s2=sb.reverse().substring(input2, input1+1);
System.out.println(s1);
	}

}
