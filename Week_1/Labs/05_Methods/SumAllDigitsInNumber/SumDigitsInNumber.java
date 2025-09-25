/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter number
b- Program calls method which takes int as an argument and returns sum of all digits in this number.

Method should look like this:
public static int sumDigitsInNumber(int number) {
<write your code here>
}

c- Program prints sum of all digits to console
*/

//Java
        import java.util.Scanner;

        public class SumDigitsInNumber {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter integer: ");
                int number = sc.nextInt();
                
                int sumOfDigits = sumDigitsInNumber(number);
                System.out.println(sumOfDigits);
            }

            public static int sumDigitsInNumber(int number) {
                int sum = 0;

                while(number != 0){
                    sum += number % 10;
                    number /= 10;
                }

                return Math.abs(sum);
            }

        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program calculates the sum of all digits in a number

## Program flow:
1- Ask user to enter an integer number
2- Call method to calculate digit sum
3- Print the result

## Key method: sumDigitsInNumber()
**How it works**:
- Uses while loop until number becomes 0
- number % 10 gives the last digit (remainder when divided by 10)
- Add this digit to the sum
- number / 10 removes the last digit (integer division)
- Math.abs() ensures positive sum for negative numbers

**Example**: number = 123
Step 1: 123 % 10 = 3, sum = 3, number = 12
Step 2: 12 % 10 = 2, sum = 5, number = 1  
Step 3: 1 % 10 = 1, sum = 6, number = 0
Result: 6

## Important details:
- Works for both positive and negative numbers
- Handles single-digit numbers correctly
- Efficiently processes any size number

📌Note: The loop continues until all digits are processed by dividing number by 10 each time
*/