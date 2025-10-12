/*
Implement console program which meet the following requirements:

a- Program starts and asks user to enter length of the side A of triangle
b- Program asks user to enter length of the side B of triangle
c- Program asks user to enter length of the side C of triangle
d- Using The Heron’s formula (https://www.mathopenref.com/heronsformula.html) programs calculates area of triangle and shows it to the user
e- In case such triangle doesn’t exist, print to console ‘NaN’
*/

//Java
	import java.util.Scanner;
	
	public class AreaOfTriangle {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please, enter A side of a triangle: ");
			double A = sc.nextDouble();
			
			System.out.print("Please, enter B side of a triangle: ");
			double B = sc.nextDouble();
			
			System.out.print("Please, enter C side of a triangle: ");
			double C = sc.nextDouble();
	
			double triangleArea;
	
			if(A+B > C && B+C > A && A+C > B){
				double p = (A+B+C)/2;
				triangleArea = Math.sqrt(p * (p-A) * (p-B) * (p-C));
			}
			
			else {
				triangleArea = Double.NaN;
			}
	
			System.out.println("Triangle area is: " + triangleArea);
				}
			
			}

/*
Explanation:
      ** First of all, I'm using VS Code :) **

1- In this program, we want to calculate the area of a triangle using **Heron’s Formula**.
   - Formula:  Area = √[p(s - a)(p - b)(p - c)]
   - where: p = (a + b + c) / 2  (perimeter of the triangle).

2- We first ask the user to input 3 sides of the triangle (A, B, C).
   - We use `Scanner` class to read user input from the console.
   - The inputs are stored as `double` because triangle sides can be decimal numbers.

3- Before calculating the area, we must check if the 3 sides can actually form a valid triangle.
   - According to the **triangle inequality theorem**, a triangle is valid if:
     A + B > C,  B + C > A,  and  A + C > B.
   - If the condition is not satisfied, we assign `Double.NaN` (Not a Number) to the result.

4- If the triangle is valid:
   - We calculate the perimeter `p = (A + B + C) / 2`.
   - Then apply Heron’s formula to find the area.

5- Finally, we print the result:
   - If the triangle exists → prints the calculated area.
   - If the triangle does not exist → prints "NaN".

*/


