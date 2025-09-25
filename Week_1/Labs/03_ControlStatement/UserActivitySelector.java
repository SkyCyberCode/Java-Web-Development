/*
Implement console program which will meet the following requirements:

a- Program is started and user is asked to enter one of possible events:
  i.   login
  ii.  sign_up
  iii. terminate_program
  iv.  main_menu
  v.   about_app

b- Based on user input program prints to console different text. Mapping is below:
        | User Input      |  Console output  |
      |-------------------|-----------------------------------------------------|
      | login             | Please, enter your username                         |
      | sign_up           | Welcome!                                            |
      | terminate_program | Thank you! Good bye!                                |
      | main_menu         | Main menu                                           |
      | about_app         | This app is created by me with support of ®IT-Build.com |
      | <any other input> | Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app |
*/

//Java
    import java.util.Scanner;
    
    public class UserActivitySelector {
        
        public static void main(String[] args) {
    		System.out.print("Please, enter action name: ");
    		Scanner sc = new Scanner(System.in);
    		String userInput = sc.nextLine();
    		
    		switch(userInput){
    			case "login":
    				System.out.println("Please, enter your username");
    				break;
    			case "sign_up":
    				System.out.println("Welcome!");
    				break;
    			case "terminate_program":
    				System.out.println("Thank you! Good bye!");
    				break;
    			case "main_menu":
    				System.out.println("Main menu");
    				break;
    			case "about_app":
    				System.out.println("This app is created by me with support of ®IT-Bulls.com");				
    				break;
    			default:
    				System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
    
    		
        			}
        		
        	}
        
        }

/*
Explanation:
    ** First of all, I'm using VS Code :) **

- This program is like a menu that asks the user what they want to do

1- First I ask the user to enter an action name using Scanner.
2- I use switch-case to check what the user typed.
3- For each valid option (login, sign_up, etc.) I print the matching message.
4- If the user types anything else, the default case shows an error message with all available options.

📌Note: The switch statement is good here because we have specific cases to check and it's cleaner than using many if-else statements
*/
