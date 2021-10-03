import java.util.*;
public class flames
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("hai!,welcome to flames");
     System.out.println("Enter the name1:");
     String scar = sc.next();
     System.out.println("Enter the name2:");
     String scar1= sc.next();
     char love[]={'F','L','A','M','E','S'}; 
     int r;
    /* for(int i=0;i<scar.length();i++)
     {
         int count=0;
         for(int j=0;j<scar1.length();j++)
         {
             if(scar.charAt(i)==scar1.charAt(j))
             {
                 System.out.println(scar.charAt(i));
                 break;
             }
         }
     }*/
     char[] a1=scar.toCharArray();
     char[] a2=scar1.toCharArray();
     int count=0;
     for(int i=0;i<a1.length;i++)
     {
         
         for(int j=0;j<a2.length;j++)
         {
             if(a1[i]==a2[j])
             {
                 a1[i]=0;
                 a2[j]=0;
                 //System.out.print(a1[i]+" "+a2[j]);
                 break;
             }
         }
     }
    // System.out.println();
     for(char c:a1)
     {
     if(c>0)      
     //System.out.print(c+" ");
     count++;
     }
     // System.out.println();
     for(char c:a2)
     {
     if(c>0)      
     //System.out.print(c+" ");
     count++;
     }
     System.out.println(count);
     int val=6;
     int i=0;
     while(val>1)
     {
         int friendship=0;
         boolean v=true;
         while(v)
         {
             if(i==6)
             {
                 i=0;
             }
             if(love[i]!='0')
             {
                 friendship++;
             }
             if(friendship==count)
             {
                 love[i]='0';
                 v=false;
             }
             i++;
         }
         val--;
     }
     int choice=0;
     for(int a=0;a<6;a++)
     {
         if(love[a]!='0')
         {
             choice=a;
             break;
         }
     }
     System.out.println(choice);
     switch(choice)
     {
         case 0:
            System.out.println(scar+" and "+scar1+" are friends ");
            break;
        case 1:
            System.out.println(scar+" and "+scar1+" are lovers ");
            break; 
        case 2:
            System.out.println(scar+" and "+scar1+" are affectionative ");
            break; 
        case 3:
            System.out.println(scar+" and "+scar1+" are going to marry ");
            break;
        case 4:
            System.out.println(scar+" and "+scar1+" are enemies ");
            break; 
        case 5:
            System.out.println(scar1+" sister of "+scar);
            break;         
     }
     System.out.println("Have a nize day!!");
 }
}