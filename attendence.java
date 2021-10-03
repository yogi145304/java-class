/*
	attendence arrangement
*/
import java.util.*;
class attendence 
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        String names[]= new String[n];
		for(int i=0;i<n;i++)
		{
			names[i]=sc.next();
		}
        String temp;
        for (int i = 0; i < n; i++) 
		{
            for (int j = i + 1; j < n; j++) 
			{
                if (names[i].compareTo(names[j]) > 0) 
				{
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) 
		{
            System.out.println(names[i]);
        }
    }
}