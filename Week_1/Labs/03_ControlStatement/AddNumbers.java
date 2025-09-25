/*
Implement console program which will meet the following requirements:

a- Program is started with two arguments (numbers)
b- Program adds these two numbers
c- In case one of the input arguments is floating-point number - the result of addition is floating-point number
d- In case two arguments are integer - the result of addition is integer
*/

//Java
    public class AddNumbers {
    
    public static void main(String[] args) {
        if(args[0].contains(".") || args[1].contains(".")){
            System.out.println(Double.parseDouble(args[0]) + Double.parseDouble(args[1]));
        }
        else
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    	}
    
    }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

# This program takes two numbers and calculate the sum of them, but if any of them was floating-point number the expected result will be floating-point number also.

1- I use "contains();" method to check if there is decimal point.
   if If a decimal point is found, We will use "Double.parseDouble();" method to convert String -> Double.
   if not, we will use "Integer.parseInt();" method to convert String -> Integer.

2- At the end, We print the result.   
*/
