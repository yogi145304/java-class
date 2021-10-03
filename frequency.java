
import java.util.*;
public class frequency
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		String n=sc.next();
		int a=n.length();
        int[] arr=new int[100];
	//	int[] arr1=new int[100];
        int count=0;
    //    System.out.println("enter the elements: ");
        for(int i=0;i<a;i++)
		{
		    int k=Character.getNumericValue(n.charAt(i));
            arr[k]++;
            
        }
	    //Arrays.sort(arr);
	for(int i=0;i<=10;i++)
	{
	    if(arr[i]>0)
	    System.out.println(i+" "+arr[i]);
    }
    }
}    