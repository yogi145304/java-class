/*
  input=abcd
  output=badc
  input=abc
  output=bac
 */
import java.util.Scanner;
public class reversetwo 
{
    public static void main(String[] args) 
	{
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
        String str1="";
        int count=0;
        int n=str.length();
        if(str.length()%2==0)
        {
            for(int i=0;i<str.length();i++)
            {
                if(i%2==1)
                {
                    count=0;
                    for(int j=i;count!=2;j--,count++)
                    {
                        str1=str1+str.charAt(j);
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(i%2==1 && i!=(n-1))
                {
                    count=0;
                    for(int j=i;count!=2;j--,count++)
                    {
                        str1=str1+str.charAt(j);
                    }
                }
                else if(i==(n-1))
                {
                    str1=str1+str.charAt(n-1);
                }
            }
        }
        System.out.println(str1);
    }
}