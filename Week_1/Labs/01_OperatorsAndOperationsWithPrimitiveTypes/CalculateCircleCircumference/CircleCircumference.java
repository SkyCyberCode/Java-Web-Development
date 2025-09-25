/*
Implement console program which meet the following requirements:

a- Program starts and asks user to enter circle radius
b- Program calculates circle circumference
c- Program prints circle circumference to console

*/

//Java
	import java.util.Scanner;
	
	public class CircleCircumference {
	    
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please, enter circle radius: ");
			double radius = sc.nextDouble();
			
			double circleCircumference = 2 * Math.PI * radius;
			System.out.println("Circle circumference is: " + circleCircumference);
		}
	    
	}

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program calculates the circumference of a circle when given its radius

1- First I ask the user to enter the circle radius and read it as a double number
2- I use the formula: circumference = 2 * π * radius
3- I use Math.PI to get the exact value of π (pi)
4- Finally I print the calculated circumference with a clear message

The program uses double data type to handle decimal numbers accurately for precise calculations
*/
