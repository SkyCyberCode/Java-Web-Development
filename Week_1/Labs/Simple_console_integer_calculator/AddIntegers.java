/*
Implement console program which meet the following requirements:
a- Program is started with 2 input arguments.

b- Program parses arguments to Integer.
To parse String arguments to int, consider the next example:
int i = Integer.parseInt(“1”);

c- Program prints sum of integers to console
*/

public class AddIntegers {

    public static void main(String[] args) {
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}

}

/*
Explanation:
  1- In Main method.. it has an empty array called "args", We can make user give us an input, We will use it as input method.
    ~ The user will give us the inputs after Compilation Process.
    ```Terminal
          javac AddIntegers.java
          java AddIntegers 3 5
    ```
    
  2- The input data type will be "String" and the program want us to calculate numbers. so, We will use "Integer.parseInt();" Method to convert from "Strings" to "Integers".
  
  At the end, We will print the result by using "System.out.println();".

  📌 Note: If you run the program without passing 2 arguments, it will throw an ArrayIndexOutOfBoundsException.
*/
