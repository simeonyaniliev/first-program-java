# Create your first Simple Java Program right NOW, in less than 5 minutes

We will create Java program that will ask the user to enter his first name, and hist last name. 
And the program will use them as super basic authentication mechanism. Plus some more fun stuff, up to us :)

Lets do it in few simple steps:
## 1. First we need go to this website (we will use it as online development environment):
https://www.onlinegdb.com/
[or if that one doesn't work we go to this website: https://compiler.run/]

## 2. And then we need make sure Java is selected from the top drop down menu, where all the programing languages are.

### 2.1. For more info on how to use this online development environment, plus super short intro on classes, methods and main methods in Java check my first tutorial in this series:
Write your first lines of Java code right NOW, in less than 5 minutes:
https://github.com/simeonyaniliev/first-lines-java

## 4. Once there we need to write the some code in there:

### 4.1 Lets write the "WoW" section of our program and click the "Run" button:

public class Main
{
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
	  String wowInput = System.console().readLine();
	  System.out.print("Wow: " + wowInput);
	
		// console execution paragraph ends
	}
}

### 4.1 Lets write the "Hi" section and click "Run" button:
public class Main
{
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
    String wowInput = System.console().readLine();
    System.out.print("Wow: " + wowInput);
	
    // -- "Hi" section
    System.out.print("Enter your first name:  ");
    String firstName = System.console().readLine();
    System.out.print("Hi " + firstName);
     
		// console execution paragraph ends
	}
}

### 4.1 Lets write the "Authenticate" section and click "Run" button:
public class Main
{
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
    String wowInput = System.console().readLine();
    System.out.print("Wow: " + wowInput);
		
		// -- "Hi" section
    System.out.print("Enter your first name:  ");
    String firstName = System.console().readLine();
    System.out.print("Hi " + firstName);
	
		// -- "Authenticate" section
    System.out.print("To authenticate, enter your last name:  ");
    String lastName = System.console().readLine();
	
		If (lastName.equals("Iliev"))  {  // write your own family name here
	       System.out.print("Regards boss: " + lastName);
		} else {
		     System.out.print("Regards : " + lastName);
		}
	
		// console execution paragraph ends

	}
}

## 5. What to do next if I want to become Java developer.
## 5.1. Go for example to: http://www.tutorialspoint.com/java/
or to: https://www.w3schools.com/java/ or find another good online Java tutorial or educational material and follow it.
## 5.2 Check my other tutorials that will follow up on the topic

