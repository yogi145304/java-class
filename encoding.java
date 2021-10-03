import java.util.*;
class encoding
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		String s="";
		String c="";
		int d=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				int j = str.charAt(i);
				j=j+5;
				s+=(char)j;
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				System.out.println("INVALID INPUT");
				d++;
			}
			else
				s+=str.charAt(i);
		}
		for(int l=0;l<str1.length();l++)
		{
			if(str1.charAt(l)>='A'&&str1.charAt(l)<='Z'||str1.charAt(l)>='a'&&str1.charAt(l)<='z')
			{
				int k=str1.charAt(l);
				k=k-5;
				c+=(char)k;	
			}
			else if(str1.charAt(l)>='0'&&str1.charAt(l)<='9')
			{
				System.out.println("INVALID INPUT");
				d++;
			}
			else
				c+=str1.charAt(l);
		}
		if(d==0)
		{
		System.out.println(s);
		System.out.println(c);
		}
	}
}