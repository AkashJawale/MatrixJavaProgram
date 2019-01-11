// java program to check 
// whether given matrix 
// is skew-symmetric or not 
import java.io.*; 

class SymmetricSkew { 
	
static int ROW =3; 
static int COL =3; 

// Utility function to create transpose matrix 
static void transpose(int transpose_matrix[][], 
						int matrix[][]) 
{ 
for (int i = 0; i < ROW; i++) 
	for (int j = 0; j < COL; j++) 
		transpose_matrix[j][i] = matrix[i][j]; 
} 

// Utility function to check skew - symmetric 
// matrix condition 
static boolean check(int transpose_matrix[][], 
					int matrix[][]) 
{ 
	for (int i = 0; i < ROW; i++) 
		for (int j = 0; j < COL; j++) 
			if (matrix[i][j] != -transpose_matrix[i][j]) 
				return false; 
	return true; 
} 

// Utility function to print a matrix 
static void printMatrix(int matrix[][]) 
{ 
	for (int i = 0; i < ROW; i++) 
	{ 
	for (int j = 0; j < COL; j++) 
			System.out.print(matrix[i][j] + " "); 
	System.out.println(); 
	} 
} 

// Driver program to test above functions 
public static void main (String[] args) { 
		int matrix[][] = { 
							{0, 5, -4}, 
							{-5, 0, 1}, 
							{4, -1, 0}, 
						}; 

	int transpose_matrix[][] = new int[ROW][COL]; 

	// Function create transpose matrix 
	transpose(transpose_matrix, matrix); 

	System.out.println ("Transpose matrix: "); 
	printMatrix(transpose_matrix); 

	// Check whether matrix is skew-symmetric or not 
	if (check(transpose_matrix, matrix)) 
	System.out.println("Skew Symmetric Matrix"); 
	else
	System.out.println("Not Skew Symmetric Matrix"); 

		
	} 
} 

