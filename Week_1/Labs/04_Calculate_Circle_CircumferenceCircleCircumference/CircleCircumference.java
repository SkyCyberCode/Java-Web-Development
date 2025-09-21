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
   
1- We used Scanner class to take input from the user.
   → The user enters the radius of the circle.

2- Formula for circle circumference:
      C = 2 * π * r
   → We used Math.PI for a more precise value of π.

3- After calculating, we printed the result using System.out.println().

So the program:
- Starts by asking user for the circle radius.
- Calculates the circumference with the formula.
- Prints the circumference to the console.
*/
