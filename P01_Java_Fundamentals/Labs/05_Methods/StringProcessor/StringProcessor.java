/*
1. Implement console program which will meet the following requirements:

- Program contains methods that can process input string according to requirements below
- You have input string like this:

Login;Name;Email

           peterson;Chris Peterson;peterson@outlook.com

           james;Derek James;james@gmail.com

           jackson;Walter Jackson;jackson@gmail.com

           gregory;Mike Gregory;gregory@yahoo.com


2. You program has next method:

public static String convert1(String input) {
<write your code here>
}

- Which formats input data like this:

            peterson ==> peterson@outlook.com

            james ==> james@gmail.com

            jackson ==> jackson@gmail.com

            gregory ==> gregory@yahoo.com


3. You program has next method:

public static String convert2(String input) {
<write your code here>
}

Which formats input data like this:

            Chris Peterson (email: peterson@outlook.com)

            Derek James (email: james@gmail.com)

            Walter Jackson (email: jackson@gmail.com)

            Mike Gregory (email: gregory@yahoo.com)
*/

//Java
        public class StringProcessor {
            public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
                    "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
                    "james;Derek James;james@gmail.com" + System.lineSeparator() +
                    "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
                    "gregory;Mike Gregory;gregory@yahoo.com";

            public static void main(String[] args) {
                System.out.println("===== Convert 1 demo =====");
                System.out.println(convert1(INPUT_DATA));

                System.out.println("===== Convert 2 demo =====");
                System.out.println(convert2(INPUT_DATA));
            }

            
            public static String convert1(String input) {
                String[] lines = input.split(System.lineSeparator());
                String result = "";

                
                for (int i = 1; i < lines.length; i++) {
                    String[] parts = lines[i].split(";");
                    String login = parts[0];
                    String email = parts[2];
                    result += login + " ==> " + email + System.lineSeparator();
                }

                return result.trim();
            }

            
            public static String convert2(String input) {
                String[] lines = input.split(System.lineSeparator());
                String result = "";

                for (int i = 1; i < lines.length; i++) {
                    String[] parts = lines[i].split(";");
                    String name = parts[1];
                    String email = parts[2];
                    result += name + " (email: " + email + ")" + System.lineSeparator();
                }

                return result.trim();
            }
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program processes user data from a string and formats it in different ways

## Program flow:
1- Has a constant INPUT_DATA with user information in "Login;Name;Email" format
2- Demonstrates two conversion methods
3- Prints the formatted results

## Key methods:
**convert1()**:
- Splits input by lines and skips the header (first line)
- For each user line, splits by ";" to get parts
- Takes login (part[0]) and email (part[2])
- Formats as "login ==> email"

**convert2()**:
- Same splitting process as convert1()
- Takes name (part[1]) and email (part[2])  
- Formats as "Name (email: email)"

## Important details:
- Starts from index 1 to skip header line
- Uses split(";") to separate data fields
- trim() removes extra empty lines at the end
- System.lineSeparator() works on any operating system

📌Note: Both methods process the same data but extract different fields for formatting
*/