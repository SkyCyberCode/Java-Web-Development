/*
Implement console program which will meet the following requirements:

a- Program starts and prints matrix to console.

Matrix to print:
{1, 2, 3, 4, 5},

      {6, 7},
      {8, 9, 10}

Output should look like this:

1 2 3 4 5
6 7
8 9 10
*/

//Java
    public class PrintMatrixToConsole {
  
  	public static void main(String[] args) {
  		int[][] matrix = {
  				{1, 2, 3, 4, 5,},
  				{6, 7},
  				{8, 9, 10}
  		};
  		
  		for(int[] arr: matrix){
  			for(int n : arr){
  				System.out.print(n + " ");
  			}
  			System.out.println();
      		}
      	}
      	
      }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program prints a matrix (2D array) where each row can have different number of elements

1- I create a 2D array with 3 rows, each row has different number of elements
2- I use enhanced for loop to go through each row in the matrix
3- For each row, I use another enhanced for loop to print all numbers in that row
4- I use print() for numbers to keep them on same line with spaces between them
5- After finishing each row, I use println() to move to the next line

📌Note: The enhanced for loop is good here because we don't need indexes, just the elements themselves
*/
