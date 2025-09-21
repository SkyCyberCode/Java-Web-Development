/*
Implement console program which meet the following requirements:

a- Program starts and asks user to input any text
b- Program prints array of words entered by user without any spaces or punctuation marks
*/
//Java
  import java.util.Arrays;
  import java.util.Scanner;

  public class SplitWords {
  	
  	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
  		System.out.print("Please, enter any text: ");
  		String userInput = sc.nextLine();
  		System.out.print("You entered these words: ");
  		System.out.println(Arrays.toString(userInput.split("[&<>'!-\\.*:,\\?\";_/()\\[\\]\\s]+")));
  	}
  
  }

