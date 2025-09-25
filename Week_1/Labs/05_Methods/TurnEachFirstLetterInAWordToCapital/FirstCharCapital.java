/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter text
b- Program format text with the next rules:

    i. all characters in word should become lower case
    ii. the first letter in the word should become upper case

c- Program prints result of formatting to console

To format text program uses next method:

public static String firstCharToTitleCase(String string) {

      <write your code here>

}
*/

//Java
        import java.util.Scanner;

        public class FirstCharCapital {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter any text: ");
                String userInput = sc.nextLine();

                System.out.println(firstCharToTitleCase(userInput));
            }

            public static String firstCharToTitleCase(String string) {
                
                string = string.toLowerCase();

                
                char[] chars = string.toCharArray();

                boolean found = false; 

                for (int i = 0; i < chars.length; i++) {
                    if (!found && Character.isLetter(chars[i])) {
                        
                        chars[i] = Character.toUpperCase(chars[i]);
                        found = true;
                    } else if (Character.isWhitespace(chars[i])) {
                    
                        found = false;
                    }
                }

                return String.valueOf(chars);
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program converts text to title case (first letter of each word uppercase, rest lowercase)

## Program flow:
1- Ask user to enter text
2- Convert entire string to lowercase first
3- Process each character to find word starts
4- Print the formatted result

## Key method: firstCharToTitleCase()
**How it works**:
- First converts whole string to lowercase
- Converts string to char array for character-by-character processing
- Uses 'found' flag to track when we're inside a word
- When finding a letter after space (start of new word), makes it uppercase
- Sets flag back to false when encountering whitespace

**Example**: "hello WORLD" becomes "Hello World"

## Important details:
- Character.isLetter() checks if character is a letter
- Character.isWhitespace() detects spaces between words
- Processes each word separately regardless of word length
- Handles multiple spaces between words correctly

📌Note: The method capitalizes first letter of every word, not just the first word
*/