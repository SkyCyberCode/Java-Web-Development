# First application: Hello World App With CMD

**Question**  

Write a simple Java program that prints Hello World to the console using the command line (CMD).  
Then, create a script that automatically deletes all generated `.class` files after execution.  

---

### Steps:  

1. Create a new Java file with CMD using:  

```cmd
notepad Main.java
```

You can change "Main" to whatever you want.  
It will say that there is no file with that name and ask to make a new one (Click **Yes**).  

---

2. Open the file (**Main.java**) and type the following code:  

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

💡 Don’t forget to save the file (**Ctrl + S**).  

---

3. Open CMD again and type:  

```cmd
javac Main.java   // Compile the file into a .class
java Main         // Run it
```

---

4. To delete all `*.class` files automatically, we will create a script:  

- First, make a `.bat` file:  

```cmd
notepad Script.bat
```

Click **Yes** to create it.  

- Inside `Script.bat`, write:  

```cmd
@echo off   // hides the executed commands for cleaner output
del *.class
```

💡 You can also add:  

```cmd
del *.java
```  
if you want to remove `.java` files after execution.  
