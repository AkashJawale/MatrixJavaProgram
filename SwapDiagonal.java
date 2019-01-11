// java Program to implement matrix 
// for swapping the upper diagonal 
// elements with lower diagonal 
// elements of matrix. 
import java.io.*; 

class SwapDiagonal 
{ 
	static int n = 4; 
	
	// Function to swap the diagonal 
	// elements in a matrix. 
	static void swapUpperToLower(int arr[][]) 
	{ 
		// Loop for swap the elements of matrix. 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = i + 1; j < n; j++) 
			{ 
				int temp = arr[i][j]; 
				arr[i][j] = arr[j][i]; 
				arr[j][i] = temp; 
			} 
		} 
		
		// Loop for print the matrix elements. 
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < n; j++) 
				System.out.print( arr[i][j] +" "); 
				System.out.println(); 
		} 
		
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
		int arr[][] = { { 2, 3, 5, 6 }, 
						{ 4, 5, 7, 9 }, 
						{ 8, 6, 4, 9 }, 
						{ 1, 3, 5, 6 } }; 

		// Function call 
		swapUpperToLower(arr); 
			
	} 
} 

