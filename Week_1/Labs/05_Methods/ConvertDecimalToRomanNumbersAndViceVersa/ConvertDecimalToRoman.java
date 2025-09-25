/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to select more:
    i. to convert from decimal to Roman number user should enter D2R
    ii. to convert from Roman number to decimal user should enter R2D
b- In case user entered random text, program asks user again to enter either D2R or R2D
c- In case user entered R2D, program asks user to enter Roman number
d- In case this is invalid Roman number, program asks user to enter Roman number again.
e- In case this is valid roman number, program converts it to decimal and prints to console.
f- In case user entered D2R, program asks user to enter integer.
g- In case this is negative integer or more than 100 or zero, program asks to enter integer again.
h- In case this is valid integer, program converts it to Roman number and prints to console.
i- Program works properly with range of numbers from 1 to 100 inclusively and the same range for Roman number
j- You are not allowed to use ‘brute force’ and create switch statement with all Roman numbers mapped to integer. Try to come up with algorithm. To understand the algorithm, you can use this wiki page https://en.wikipedia.org/wiki/Roman_numerals.

You have to implement next methods:

public static String decimal2Roman(int number) {
      <write your code here>
}

public static int roman2Decimal(String romanNumber) {
      <write your code here>

     }

          public static boolean isRomanNumberValid(String romanNumber) {

                <write your code here>

           }

          public static boolean isDecimalNumberValid(int decimalNumber) {

                 <write your code here>

          }

*/

//Java
        import java.util.Scanner;

        public class ConvertDecimalToRoman {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                mainLoop: while (true) {
                    System.out.print("Please, select mode. If you want to convert Roman "
                            + "numbers to decimal - type 'R2D' and press enter."
                            + System.lineSeparator()
                            + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

                    String mode = sc.next();
                    if (mode.equalsIgnoreCase("R2D")) {
                        while (true) {
                            System.out.print("Please, enter Roman number you want to convert: ");
                            String romanNumber = sc.next();
                            if (isRomanNumberValid(romanNumber)) {
                                System.out.println(roman2Decimal(romanNumber));
                                break mainLoop;
                            } else {
                                System.out.println("You entered invalid Roman number. "
                                        + "Please, try one more time.");
                                continue;
                            }
                        }
                    } else if (mode.equalsIgnoreCase("D2R")) {
                        while (true) {
                            System.out.print("Please, enter decimal number "
                                    + "you want to convert: ");
                            int decimalNumber = sc.nextInt();
                            if (isDecimalNumberValid(decimalNumber)) {
                                System.out.println(decimal2Roman(decimalNumber));
                                break mainLoop;
                            } else {
                                System.out.println("Please, enter positive integer from 1 to 100.");
                                continue;
                            }

                        }

                    }
                    
                    System.out.println("Please, enter 'R2D' or 'D2R.");
                }
            }

            

            /**
             * Converts decimal numbers to Roman.
             * 
             * Takes int value as a parameter. Works only with numbers from 1 to 100.
             * 
             * @param number to convert to Roman.
             * @return string of Roman number.
             */
            public static String decimal2Roman(int number) {
                int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
                String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

                String result = "";
                for (int i = 0; i < values.length; i++) {
                    while (number >= values[i]) {
                        number -= values[i];
                        result += symbols[i];
                    }
                }
                return result;
            }

            /**
             * Converts Roman numbers to decimal.
             * 
             * Takes string value with Roman number as a parameter.
             * 
             * At first method validates if input string could be Roman number. After method
             * uses algorithm to convert Roman numeral to decimal.
             * 
             * @param romanNumber
             * @return decimal representation of Roman number
             */

            public static int roman2Decimal(String romanNumber) {
                int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
                String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

                int i = 0;
                int result = 0;
                while (romanNumber.length() > 0 && i < symbols.length) {
                    if (romanNumber.startsWith(symbols[i])) {
                        result += values[i];
                        romanNumber = romanNumber.substring(symbols[i].length());
                    } else {
                        i++;
                    }
                }
                return result;
            }


            /**
             * Validation for Roman numbers.
             * 
             * Use regular expression which is checking if string really could be Roman
             * number.
             * 
             * @param romanNumber
             * @return true if String is Roman number
             */
            public static boolean isRomanNumberValid(String romanNumber) {
                return romanNumber.matches("^C{0,1}(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
            }
            
            public static boolean isDecimalNumberValid(int decimalNumber) {
                return decimalNumber >= 1 && decimalNumber <= 100;
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program converts between decimal numbers and Roman numerals (1-100 range)

## Main Program Flow:
1- Ask user to choose conversion mode (R2D or D2R)
2- Use while loops to keep asking until valid input is entered
3- For R2D: Validate Roman number, then convert to decimal
4- For D2R: Validate decimal number (1-100), then convert to Roman

## Key Methods:
**decimal2Roman()**: 
- Uses arrays of values and symbols in descending order
- Subtracts largest possible values and appends corresponding symbols
- Example: 94 = 90 (XC) + 4 (IV) = "XCIV"

**roman2Decimal()**: 
- Checks if Roman number starts with known symbols
- Adds corresponding values and removes matched symbols
- Example: "XCIV" = 90 (XC) + 4 (IV) = 94

**Validation**:
- isRomanNumberValid(): Uses regex to check valid Roman patterns
- isDecimalNumberValid(): Checks if number is between 1-100

📌Note: The algorithm avoids brute force by using value-symbol mapping and systematic conversion
*/