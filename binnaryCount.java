import java.util.*;
class binnaryCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		int count=0;
		while(s>0)
		{
			int num = s%2;
			if(num==1)
			{
				count++;
			}
			s=s/2;
		}
		System.out.println(count);
		
	}
}