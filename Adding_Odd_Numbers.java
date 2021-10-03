import java.util.*;
class Adding_Odd_Numbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp,k=0;
		while(n!=0)
		{
			temp=n%10;
			if(temp%2!=0)
				k+=temp;
			n/=10;
		}
		System.out.println(k);
	}
}