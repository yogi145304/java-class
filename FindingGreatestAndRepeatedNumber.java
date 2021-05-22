import java.util.*;
class FindingGreatestAndRepeatedNumber
{
	public static void main(String[] args)
	{
		Scanner dc = new Scanner(System.in);
		int array[];
		int n;
		int temp;
		System.out.println("enter the array size: ");
		n = dc.nextInt();
		array = new int[n];
		for(int m=0;m<n;m++)
		{
			array[m]=dc.nextInt();
		}
		for(int i=0;i<n;i++)  
		{  
			for (int j=0;j<(n-1);j++)  
			{  
				if(array[i]<array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
				
					}
			}
		}
		System.out.println("sorted array: ");
		for(int k=0;k<n;k++)
		{
			System.out.print(+array[k]+" ");
		}
		System.out.println();
		System.out.println("the largest number is: "+array[n-1]);
		int count=0;
		for(int l=1;l<n;l++)
		{
			if(array[l-1]==array[n-1])
			{
				count++;
			}
			else
				continue;
		  				
		}
		System.out.println("number of times repeated: "+count+"times");	
	}
}