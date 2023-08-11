package Assign1;

public class Palindrome1 {

	
		
		public static boolean Palindrome(String s)
		{
		int l=0;

		int R=s.length()-1;
		while(l<R)
		{
			if(s.charAt(l)!=s.charAt(R))
				return false;
			l++;
			R--;
			
		}
		return true;
		}
		
		
		public static boolean Vowels(String s)
		{
			int Count=0;
			boolean[] vowels=new boolean[26];
			
			for(char ch:s.toCharArray())
			{
				if(isVowel(ch)&&!vowels[ch-'a'])
						{
					vowels[ch-'a']=true;
					Count++;
						}
				if(Count>=2)
					return true;
			}
					return false;
			
			}
			
			public static boolean isVowel(char ch)
			{
				return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
			}
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String input="maeam";
			boolean isPalindrome=Palindrome(input);
			boolean diff_Vowel=Vowels(input);
			
			System.out.println("Palindrome:"+isPalindrome);
			
			System.out.println("vowels:"+diff_Vowel);
			
			
	}

}
