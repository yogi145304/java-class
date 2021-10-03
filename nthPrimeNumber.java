import java.util.*;
public class nthPrimeNumber 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total iteration:");
        int total = input.nextInt();
        int count1=0;
            for (int l = 2; count1<total; l++) 
			{
                int count = 0;
                for (int i = 2; i <= l / 2; i++) 
				{
                    if (l % i == 0) 
					{
                        count++;
                    }

                }
                if(count == 0)
                {
                    //System.out.print(l+" ");
                    count1++;
                }
                if(count1==total)
                {
                    System.out.println(l);
                }
            }
        }

}