import java.util.*;
class specialCharacter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		int numberOfSplCharacters;
		for(int i=0;i<str.length();i++)
		{
			//int k = 'a';
			//System.out.println(k);
			if((str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='0' && str.charAt(i)<='9' || str.charAt(i)>='A' && str.charAt(i)<='Z'))
				count++;
		}
		numberOfSplCharacters = str.length()-count;
		System.out.println(numberOfSplCharacters);
	}
}