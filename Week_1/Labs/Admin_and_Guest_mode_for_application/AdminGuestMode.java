/*
Implement console program which will meet the following requirements:

a- Program can be started in ‘admin’ and ‘guest’ mode
b- To start program in ‘admin’ mode any of multiple string arguments should be equal to ‘--admin’
c- To start program in ‘guest’ mode any of multiple string arguments should be equal to ‘--guest’
d- Program cannot be started with ‘--admin’ and ‘--guest’ arguments simultaneously
e- If program is started in ‘admin’ mode then "Hello, Admin!" is printed to console
f- If program is started in ‘guest’ mode then "Hello, Guest!" is printed to console
g- If program is started with ‘--admin’ and ‘--guest’ arguments then program prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to console
*/

//Java
    public class AdminGuestMode {

		public static String ADMIN_MODE = "--admin";
		public static String GUEST_MODE = "--guest";
    public static void main(String[] args) {
		String input = String.join(",", args);

		if(input.contains(ADMIN_MODE) && input.contains(GUEST_MODE)){
			System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}

		else if (input.contains(ADMIN_MODE)){
			System.out.println("Hello, Admin!");
		}
		
		else if(input.contains(GUEST_MODE)){
			System.out.println("Hello, Guest!");
		}

			
	      }

    }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- I need to check the command line arguments to determine the program mode

1- I use String.join to combine all args into one string separated by commas
   so I can easily use contains() to search for --admin or --guest

2- First I check if both --admin and --guest are present at the same time
   If I find them together, I print the message to select only one mode

3- If I find only --admin, I print "Hello, Admin!"

4- If I find only --guest, I print "Hello, Guest!"

5- If no arguments are found, the program doesn't do anything (which is fine according to requirements)

📌Note: I'm checking if the words exist anywhere in the string, which is sufficient for this case
*/
