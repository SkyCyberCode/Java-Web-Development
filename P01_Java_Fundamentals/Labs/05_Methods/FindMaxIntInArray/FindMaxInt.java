/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to input integer numbers separated by space.
b- Program creates array object with entered numbers.
c- Program calls specific method which takes int[] as an parameter and returns max value in this array.

Method should look like this:
public static int findMaxIntInArray(int[] intArray) {

<write your code here>
}


Program prints max value from the array to the console.

*/

//Java
        import java.util.Arrays;
        import java.util.Scanner;

        public class FindMaxInt {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter integer numbers separated by space: ");
                String str = sc.nextLine();
                String[] strArray = str.split("\\s+");
                int[] intArray = new int[strArray.length];

                for(int i=0; i<strArray.length; i++){
                    intArray[i] = Integer.parseInt(strArray[i]);
                }

                int maxInt = findMaxIntInArray(intArray);
            
                System.out.println("*** Initial Array ***");
                System.out.println(Arrays.toString(intArray));
                System.out.println("*** Max number in array ***");
                System.out.println(maxInt);
            }

            
            public static int findMaxIntInArray(int[] intArray) {
                
                int max = 0;

                for(int i=0; i<intArray.length; i++){

                    if(max<intArray[i]){
                        max = intArray[i];
                    }

                }
                
                return max;

            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program finds the maximum number from user input

## Program flow:
1- Ask user to enter numbers separated by spaces
2- Split input string into string array
3- Convert each string to integer and store in int array
4- Find the maximum number in the array
5- Print both the original array and the max number

## Key method: findMaxIntInArray()
- Starts with max = 0 as initial value
- Goes through each number in the array
- If current number is bigger than max, updates max to that number
- Returns the largest number found

## Important details:
- Uses split("\\s+") to handle multiple spaces
- Integer.parseInt() converts strings to numbers
- Arrays.toString() makes array printing look nice

📌Note: If all numbers are negative, starting with max=0 might not work correctly
*/