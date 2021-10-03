/*  trailing_Zero of factorial value
    eg 10!=3628800
    so answer is 2 */
import java.util.*;
class trailing_Zero
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=1;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			k=k*i;
		}
		System.out.println(k);
		while(k>0)
		{
			int l=k%10;
			if(l==0)
				count++;
			k=k/10;
		}
		System.out.println(count);
	}
}