import java.util.*;
class characterCount
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();	
		String alpha="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<26;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(alpha.charAt(i)==str.charAt(j))
					count++;
			}
		
			
			if(count>0)
				System.out.println("Number of occurrence of "+alpha.charAt(i)+" is:"+count);
			
		}
	}
}