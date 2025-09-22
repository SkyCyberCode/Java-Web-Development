/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter integer number
b- Program prints each digit from the new line

EXAMPLE:
User input: “12345”

Program console output:
1
2
3
4
5
*/

//Java
    import java.util.Scanner;
    
    public class NewLineForDigit {
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    		System.out.print("Please, enter any integer: ");
        String str = sc.nextLine();
            
            for(int i=0; i<str.length(); i++){
              System.out.println(str.charAt(i));
                }
            }
           
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program takes a number from user and prints each digit on a separate line

1- First I ask the user to enter a number and read it as a String
2- I use a for loop to go through each character in the string
3- For each position in the string, I use charAt(i) to get the digit at that position
4- I print each digit using println() so each one goes on a new line

Why read as String? Because it's easier to get each digit separately without math operations
*/
