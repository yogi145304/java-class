import java.util.*;
class custumerID
{
	public static void main(String[] yogi)
	{
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of custumerID: ");
		n= sc.nextInt();
		String[] arr= new String[n];
		System.out.println("enter the custumerID: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("invalid custumerID's: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i].length()<6)
			{
				 System.out.print(arr[i]+" ");
				 count++;
			}
			else
				continue;
			 
		}
		if(count==0)
			System.out.println(0);
	}
}
