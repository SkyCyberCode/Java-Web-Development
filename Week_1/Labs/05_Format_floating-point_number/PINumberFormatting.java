/*
Implement console program which meet the following requirements:

a- Program starts and prints Math.PI five times in console output
b- The first Math.PI contains only one fraction digit
c- The second Math.PI contains two fraction digits
d- The third time Math.PI contains three fraction digits
e- The fourth time Math.PI contains four fraction digits
f- The fifth time Math.PI contains five fraction digits
*/

//Java
	public class PINumberFormatting {
		
	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			System.out.println(String.format("%."+i+"f",Math.PI));
				
			}
			
		}
	
	}

/*
Explanation:
		** First of all, I'm using VS Code :) **

1. Goal:
   - Print Math.PI five times with increasing number of fraction digits (1..5).

2. Approach:
   - Use a for-loop with variable 'i' from 1 to 5.
   - For each i, build a format pattern string: "%."+i+"f".
     Example:
       i = 1 -> "%.1f"
       i = 2 -> "%.2f"
   - Use String.format(format, Math.PI) to format the double value according to the pattern.
   - Print the formatted result with System.out.println().

3. Rounding behavior:
   - String.format uses standard rounding (half-up) when formatting.
     So you will see:
       1 digit  -> 3.1
       2 digits -> 3.14
       3 digits -> 3.142
       4 digits -> 3.1416
       5 digits -> 3.14159

4. Notes & alternatives:
   - You can also use System.out.printf directly:
       System.out.printf(fmt + "%n", Math.PI);
     which prints formatted output with a newline.

5. Example output (exact lines):
   3.1
   3.14
   3.142
   3.1416
   3.14159

This file is ready to compile and run:
   javac PINumberFormatting.java
   java PINumberFormatting
*/

