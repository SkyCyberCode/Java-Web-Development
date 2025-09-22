# Don't forget before begining!!
-You should donwload JDK (Java Development Kit), It contains all Java tools like (javac, JRE, Javac, etc.)

### Download
-This step for all OS (Windows, Mac, Linux).. You can download it from the Official site of `Oracle` from here -> ```https://www.oracle.com/middleeast/java/technologies/downloads/```

**Note**
- I recommend you download Long-Term Support (LTS) JDK Version.
- Long-term support (LTS) offers advantages like reduced costs from less frequent upgrades, greater stability and proven performance, and enhanced compatibility with other systems.

---

### Installation

   # Windows
   
   ### Steps: 

   1. Run Installer**
   
   1- Double-click jdk-xx_windows-x64_bin.exe
   
   2- Follow setup wizard: Next → Next → Install
        
   **Step 2: Set Environment Variables**
      1. Search "Environment Variables" in Start menu
      2. Click "Edit the system environment variables"
      3. Click "Environment Variables" button
      4. In System Variables section:
         - Click "New" and add:
           Variable name: JAVA_HOME
           Variable value: C:\Program Files\Java\jdk-xx.x.x
         - Edit Path variable:
           Click "Edit" → "New" → Add: %JAVA_HOME%\bin
        
   **Step 3: Verify Installation**
      Open Command Prompt and type:
      ```CMD
      java -version
      javac -version```













---

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

💡 Note:
Make sure you are inside the same folder where your Java files (Main.java, Main.class) and script (Script.bat) are located.
Otherwise, the commands (javac, java, del) won’t work correctly.

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
