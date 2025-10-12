/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to input height of the rectangle
b- After user inputs heights of the rectangle, program asks to input width of the rectangle.
c- Program calls specific method which takes two parameters of int type which prints rectangle to the console:

******
*    *
******

In the example above height of the rectangle is 3, the width of the rectangle is 6

N.B.: rectangle is empty inside
*/

//Java
        import java.util.Scanner;

        public class EmptyRectangle {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter height of rectangle: ");
                int height = sc.nextInt();
                System.out.print("Please, enter width of rectangle: ");
                int width = sc.nextInt();
                
                drawRectangle(height, width);
            }

            public static void drawRectangle(int height, int width) {

                //The Upper part
                for(int i=1; i<=width; i++){
                    System.out.print("*");
                }
                System.out.println();

                //Middle part
                for(int i=1; i<=height-2; i++){
                    System.out.print("*");

                    for(int j=1; j<=width-2; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

                //The Lower part
                for(int i=1; i<=width; i++){
                    System.out.print("*");
                }
            }

        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program draws an empty rectangle using stars based on user input

## How it works:
1- Ask user for rectangle height and width
2- Call drawRectangle method to print the shape

## Drawing steps:
**Upper line**: Print full line of stars (width times)

**Middle part**: 
- Print star at start
- Print spaces for the middle (width-2 times)  
- Print star at end
- Repeat this for (height-2) lines to create empty inside

**Lower line**: Print full line of stars (width times)

## Important details:
- Uses height-2 for middle to account for top and bottom lines
- Uses width-2 for spaces to account for side stars
- Each line ends with println() to move to next line

📌Note: The rectangle is hollow inside with stars only on the border
*/