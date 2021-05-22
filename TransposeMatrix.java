import java.util.*;
public class TransposeMatrix
{ 
	public static void main(String args[])
	{  
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		int row = sc.nextInt();
		System.out.print("Input total column : ");
		int column = sc.nextInt();
		int [][] original_matrix = new int[row][column];
		int [][] transpose = new int[row][column];
		for (int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++) 
			{
			System.out.println("Row ["+i+"]:  Column ["+j+"] :");
			original_matrix[i][j] = sc.nextInt(); 
			}
		}

		for(int i=0;i<row;i++)
		{    
			for(int j=0;j<column;j++)
			{    
				transpose[i][j]=original_matrix[j][i];  
			}    	
		}    
  
		System.out.println("Printing Matrix without transpose:");  
		for(int i=0;i<row;i++)
			{    
				for(int j=0;j<column;j++)
				{    
					System.out.print(original_matrix[i][j]+" ");    
				}    
				System.out.println();  
			}    
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<row;i++)
		{    
			for(int j=0;j<column;j++)
			{    
				System.out.print(transpose[i][j]+" ");    
			}    
			System.out.println(); 
		}    
	
	  
	}
}	