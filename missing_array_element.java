import java.util.Scanner; 
public class missing_array_element 
{ 
 public static void main(String[] args) { 
 Scanner ip=new Scanner(System.in);
 int n=ip.nextInt(); 
 int a[]=new int[n]; 
 System.out.println("enter the numbers between 1-10"); 
 for(int i=0;i<n;i++) 
 { 
 a[i]=ip.nextInt(); 
 } 
 System.out.println("the missing numbers are"); 
 for(int i=1;i<=10;i++) 
 { 
 int max=0; 
 for(int j=0;j<n;j++) 
 { 
 if(a[j]==i) 
 { 
 max=1; 
 } 
 } 
 if(max==0) 
 { 
 System.out.print(i+" "); 
 } 
 } 
 } 
}