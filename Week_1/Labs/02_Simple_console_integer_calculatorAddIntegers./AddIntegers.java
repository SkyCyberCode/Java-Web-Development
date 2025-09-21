/*
Implement console program which meet the following requirements:
a- Program is started with 2 input arguments.

b- Program parses arguments to Integer.
To parse String arguments to int, consider the next example:
int i = Integer.parseInt(“1”);

c- Program prints sum of integers to console
*/
//Java
	
	public class AddIntegers {
	
	    public static void main(String[] args) {
			System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		}
	
	}

/* 
Explanation:
		** First of all, I'm using VS Code :) **
  
  1. The main method takes input arguments in the form of a String array called "args[]".
     When the program is executed from the command line, the user provides these arguments.

  2-  Since the inputs are Strings, we use the method Integer.parseInt() to convert them into integers.
  
  3. After conversion, we simply add the two integers and print the result using System.out.println().

    ```Terminal
          javac AddIntegers.java
          java AddIntegers 3 5
    ```
	Output: 8

  📌 Note: If you run the program without passing 2 arguments, it will throw an ArrayIndexOutOfBoundsException.
*/
