# Lab: DemoEnum

## Objective
The objective of this lab is to demonstrate the usage of Java enums with custom properties and methods, specifically showing how different message types can be associated with priority levels.

## Requirements / Input & Output
- **Input:** String input from user representing message type (A, B, C, or D)
- **Output:** Priority level (HIGH, MEDIUM, LOW) corresponding to the entered message type

## Approach / Algorithm
The program uses two enums: MessageType and Priority. Each MessageType constant (A, B, C, D) is associated with a Priority value. The program validates user input and retrieves the corresponding priority using enum methods.

## 🛠 Step-by-step Implementation
1. Read user input using Scanner
2. Validate if input is a valid message type (A, B, C, or D)
3. If valid, convert input to MessageType enum and display its priority
4. If invalid, show error message and prompt for input again

## Code walkthrough
- **Main method in DemoEnum class:**
  - Creates Scanner object for user input
  - Uses infinite loop to repeatedly ask for input until valid value is entered
  - Calls isValidMessageType() to validate input
  - Uses MessageType.valueOf() to convert String to enum
  - Calls getPriority() method on enum instance

- **Method: `isValidMessageType(String userInput)`**  
  - Input: String  
  - Output: boolean  
  - Logic: Checks if input string equals "A", "B", "C", or "D" using simple string comparison

- **Enum: `MessageType`**  
  - Contains four constants: A(HIGH), B(MEDIUM), C(LOW), D(LOW)
  - Each constant stores a Priority enum value
  - Constructor takes Priority parameter and assigns it to final field
  - getPriority() method returns the stored priority

- **Enum: `Priority`**  
  - Simple enum with three constants: HIGH, MEDIUM, LOW

## Example (Input / Output)
Please, enter message type to check it priority:
A
HIGH

Please, enter message type to check it priority:
X
Please, enter valid message type. Only 'A', 'B', 'C' or 'D' are allowed
Please, enter message type to check it priority:
C
LOW

# Notes / Tips 
- Using enums with custom properties makes code more type-safe and maintainable
- The valueOf() method throws IllegalArgumentException if invalid string is passed
- Using final field for priority ensures enum constants are immutable
- This pattern is useful for configuration mapping and state management
