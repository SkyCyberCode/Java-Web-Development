/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter random words separated by space
b- Program asks user to enter minimum length of string to filter words which were entered
c- Program creates array object from entered words
d- Program calls specific method which takes String[] as a parameter and returns array of strings which contains words that have length more or equal to value specified by user

Method should look like this:
public static String[] filterWordsByLength(int minLength, String[] words) {

             <write your code here>
      }

e. Program prints filtered array to the console output.
*/

//Java
        import java.util.Scanner;
        import java.util.Arrays;

        public class FilterStringArray {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter any words separated by space: ");
                String userInput = sc.nextLine();
                System.out.print("Please, enter minumum word length to filter words: ");
                int minLength = sc.nextInt();
                
                String[] words = userInput.split("\\s+");
                String[] filteredWords = filterWordsByLength(minLength, words);
                System.out.println(Arrays.toString(filteredWords));
            }

            
            
            public static String[] filterWordsByLength(int minLength, String[] words) {

                int count=0;

                for(String word : words){
                    if(word.length() >= minLength){
                        count++;
                    }
                }

                String[] filtered = new String[count];

                int index=0;
                for(String word : words){
                    if(word.length() >= minLength){
                        filtered[index] = word ;
                        index++;
                    }
                }

                return filtered;

            }

        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program filters words based on minimum length specified by user

## Program flow:
1- Ask user to enter words separated by spaces
2- Ask user for minimum word length to filter
3- Split input string into array of words
4- Filter words that meet the length requirement
5- Print the filtered words

## Key method: filterWordsByLength()
**First loop**: 
- Counts how many words meet the length requirement
- This helps create new array with exact size needed

**Second loop**:
- Creates new array with the counted size
- Copies only words that are long enough
- Uses index variable to track position in new array

## Important details:
- split("\\s+") handles multiple spaces between words
- Two-pass approach: first count, then copy
- This avoids creating array that's too big or too small

📌Note: The program only keeps words that are equal or longer than minimum length
*/