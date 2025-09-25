/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter the height of the pyramid.
b- Program draws such picture in console:


*
**
***
****
***
**
*

In example above the height of the pyramid is 4
*/

//Java
    import java.util.Scanner;
    
    public class PyramidInConsole {
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
    		System.out.print("Please, enter height of the pyramid: ");
            int height = scanner.nextInt();
            
            
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            
            for (int i = height - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                }
                
                
            }
        
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program draws a pyramid pattern using stars based on the height user enters

1- I ask the user for the pyramid height and read it as an integer
2- First loop: goes from 1 to height to build the upper part of pyramid
   - For each row, I print stars equal to the row number (1 star in row 1, 2 stars in row 2, etc.)
3- Second loop: goes from height-1 down to 1 to build the lower part of pyramid  
   - This prints decreasing number of stars to complete the symmetric shape
4- I use println() after each row to move to the next line

Why height-1 in second loop? Because the widest row should appear only once at the center
*/
