import java.util.*;
public class primeNumberInRange 
{
    public static void main(String[] args) 
	{
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("Enter the total iteration:");
        int total = input.nextInt();
        for(int l=n;l<total;l++)
		{
            int count=0;
            for(int i=2;i<=l/2;i++)
            {
                if(l%i==0)
                {
                    count++;
                }

            }
            System.out.print((count==0)?l+" ":"");
        }
    }

}