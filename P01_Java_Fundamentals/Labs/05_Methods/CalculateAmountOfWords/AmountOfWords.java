/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter text.
b- Program calls specific function which take one parameter of String type and returns amount of words in the text.

Method should look like this:
public static int getWordsAmount(String text) {
<write your code here>
}


Program prints amount of words to the console.
 */

 //Java
        import java.util.Scanner;

        public class AmountOfWords {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter any text: ");
                String text = sc.nextLine();
                
                int amountOfWords = getWordsAmount(text);
                System.out.println("Amount of words in your text: " + amountOfWords);
            }

            public static int getWordsAmount(String text) {
                String[] str = text.split("\\s+");
                return str.length;
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program counts how many words are in the text that user enters

1- I ask the user to enter text and read it using Scanner
2- I call the getWordsAmount method and pass the user's text to it
3- The method splits the text into words using split("\\s+")
   - \\s+ means split by spaces (one or more spaces)
4- The method returns the length of the array, which equals the word count
5- Finally I print the result with a clear message

📌Note: The \\s+ pattern handles multiple spaces between words so we get accurate word count
*/

