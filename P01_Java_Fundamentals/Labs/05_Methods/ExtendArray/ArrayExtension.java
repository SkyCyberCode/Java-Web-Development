/*
Implement console program which will meet the following requirements:

a- Program starts and asks user to enter length of an array.
b- Program generates array of random integer numbers (use java.util.Random) with array length specified by user. Random numbers should be between 1 and 100.

Method should look like this:
public static int[] generateRandomArray(int amountOfElements) {
        <write your code here>
}


c- Program creates the second array with size of twice as much as the first array.
d- The first elements in the new array are first the same elements as in old array. The other half of elements are elements as in the first array multiplied by two.

public static int[] extendArray(int[] arr) {

             <write your code here>

        }

For example, if user set initial array length as ten:
array #1 - {1, 3, 5, 7, 10, 11, 12, 15, 17, 20} (generated randomly)
array #2 - {1, 3, 5, 7, 10, 11, 12, 15, 17, 20, 2, 6, 10, 14, 20, 22, 24, 30, 34, 40}
*/

//Java
        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

        public class ArrayExtension {
            
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please, enter length of initial array: ");
                int baseArrayLength = sc.nextInt();
                int[] arr = generateRandomArray(baseArrayLength);
                int[] extendedArray = extendArray(arr);
                System.out.println("*** Initial array ***");
                System.out.println(Arrays.toString(arr));
                System.out.println("*** Extended array ***");
                System.out.println(Arrays.toString(extendedArray));
            }

            /**
             * The method extends array.
             * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
             * is returned from this method.
             * 
             * @param arr - base of extension. Extended array contains elements from this array
             * and additionally contains the same elements multiplied by two. 
             * @return extended array.
             */
            public static int[] extendArray(int[] arr) {
                int[] extended = new int[arr.length * 2];

                for(int x=0; x<arr.length; x++){
                    extended[x] = arr[x];
                }

                for(int i=0; i<arr.length; i++){
                    extended[i+arr.length] = extended[i] * 2;
                }

                return extended;

            }

            public static int[] generateRandomArray(int amountOfElements) {
                int[] randomNum = new int[amountOfElements];
                Random rn = new Random();
                for(int i=0; i<amountOfElements; i++){
                    randomNum[i] = rn.nextInt(100) + 1;
                }

                return randomNum;
            }

        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program creates a random array and then extends it by doubling its size

## Program flow:
1- Ask user for array length
2- Generate random array with numbers between 1-100
3- Create extended array that is twice the size
4- Print both arrays

## Key methods:
**generateRandomArray()**:
- Creates new array with given length
- Uses Random class to fill with numbers from 1 to 100
- nextInt(100) gives 0-99, so +1 makes it 1-100

**extendArray()**:
- Creates new array with double the size
- First half: copies original array elements
- Second half: takes elements from first half and multiplies by 2
- Uses two separate loops for copying and doubling

## Important details:
- extended[i+arr.length] places doubled elements in second half
- Arrays.toString() makes printing arrays easy to read
- Random numbers make each run different

📌Note: The extended array contains original values followed by their doubles
*/