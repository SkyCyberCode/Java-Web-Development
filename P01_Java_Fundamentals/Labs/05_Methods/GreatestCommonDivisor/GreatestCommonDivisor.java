/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter two numbers separated by space
b- Programs call specific method to find greatest common divisor.

Method should look like this:
public static int gcdRecursive(int firstNumber, int secondNumber) {
<write your code here>
}

c- Program prints greatest common divisor to console
*/

//Java
        import java.util.Scanner;

        public class GreatestCommonDivisor {
            

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter two numbers separated by space: ");
                String userInput = sc.nextLine();
                
                String[] inputArgumentsArray = userInput.split("\\s+");
                int number1 = Integer.parseInt(inputArgumentsArray[0]);
                int number2 = Integer.parseInt(inputArgumentsArray[1]);

                System.out.println(gcdRecursive(number1, number2));
            }
            
            public static int gcdRecursive(int firstNumber, int secondNumber) {
                if (secondNumber == 0) {
                    return firstNumber;
                }
                return Math.abs(gcdRecursive(secondNumber, firstNumber % secondNumber));
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program finds the Greatest Common Divisor (GCD) of two numbers using recursion

## Program flow:
1- Ask user to enter two numbers separated by space
2- Split input and convert to integers
3- Call recursive method to calculate GCD
4- Print the result

## Key method: gcdRecursive()
**How it works**:
- Uses Euclidean algorithm: GCD(a, b) = GCD(b, a % b)
- When second number becomes 0, first number is the GCD
- Math.abs() ensures result is always positive

**Example**: GCD(48, 18)
Step 1: GCD(48, 18) → GCD(18, 48 % 18 = 12)
Step 2: GCD(18, 12) → GCD(12, 18 % 12 = 6)  
Step 3: GCD(12, 6) → GCD(6, 12 % 6 = 0)
Step 4: second number is 0, so GCD is 6

## Important details:
- Recursive calls continue until remainder is zero
- Works for both positive and negative numbers
- Very efficient mathematical approach

📌Note: This method uses recursion which calls itself until the problem is solved
*/