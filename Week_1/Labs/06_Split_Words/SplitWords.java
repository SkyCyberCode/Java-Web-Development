/*
Implement a console program that meets the following requirements:

a- The program starts and asks the user to input any text.
b- The program prints an array of words entered by the user without any spaces or punctuation marks.
*/

//Java
import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.print("You entered these words: ");
        System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
        
    }

}

/*
Explanation:
    ** Note: I'm using VS Code **

- The program asks the user for input and then prints it without punctuation marks or spaces.

1- It takes the input using the `Scanner` class with the `sc.nextLine()` method to allow the user to input a full string.

2- It uses the `split()` method to separate the string using a pattern that matches punctuation marks or spaces.

3- Pattern: "[\\p{P}\\s]+"
      [...] -> matches a single character from the options.
      \p{P} -> matches any punctuation mark.
      \s    -> matches any whitespace character.
      +     -> means one or more occurrences.

📌Note: We need to use an extra backslash ("\") for escaping because the pattern is inside a string literal.
*/
