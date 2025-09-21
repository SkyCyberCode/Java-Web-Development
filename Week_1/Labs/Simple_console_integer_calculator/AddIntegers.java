/*
Implement console program which meets the following requirements:
a- Program is started with 2 input arguments.

b- Program parses arguments to Integer.
   Example: int i = Integer.parseInt("1");

c- Program prints sum of integers to console.
*/

public class AddIntegers {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }

}

/*
Explanation:
1- In the main method, we receive an array called "args". This array stores the input arguments 
   that the user provides when running the program.

   Example of running the program with inputs:
       javac AddIntegers.java
       java AddIntegers 3 5

2- Since the input arguments are Strings by default, we need to convert them into integers. 
   To do this, we use the method Integer.parseInt().

3- Finally, we add the two integers and print the result using System.out.println().
*/
