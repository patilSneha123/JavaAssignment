package Assign2;


import java.util.HashMap;


//HashMap=It stores the element in key value pair 

/*Input1=845.69, output=3:2;
Input1=20.789; output=2:3;
Input1=20.0; output=2:1;  
output is in Hashmap format.
Hint: count the no of digits.*/

public class Que20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String Input1="845.69";
	int count = 0;
	int ccount=0;
	String ar[]=Input1.split("[.]");
	String s1=ar[0];
	int a=Integer.parseInt(s1);
	while(a>0)
	{
		a=a/10;
		count++;
	}
	System.out.println(count);
    String s2=ar[1];
    int b=Integer.parseInt(s2);
	while(b>0)
	{
		b=b/10;
		ccount++;
		}

		System.out.println(ccount);
		
	HashMap<Integer,Integer>map=new HashMap<>();
	map.put(count, ccount);
	System.out.println(map);
	
		
/*HashMap<String,Integer>map=new HashMap<>();
map.put("Input1", (int) 845.69);
map.put("Input2", (int) 20.789);
map.put("Input3", (int) 20.0);

	if(map.containsKey("Input1")) {
		Integer a=map.get("Input1");
	
	System.out.println(a);*/
	}
	
	
	}


