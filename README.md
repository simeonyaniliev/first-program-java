# Create your first Simple Java Program right NOW, in less than 15 minutes

We will create Java program that will ask the user to enter his first name, and his last name. 
And the program will use that data for the user as super basic authentication mechanism. Plus some more fun stuff, up to us :)

Lets do it in few simple steps:
## 1. First we need go to this website (we will use it as online development environment):
https://www.onlinegdb.com/

[or if that one doesn't work we go to this website: https://compiler.run/]

## 2. And then we need make sure Java is selected from the top drop down menu, where all the programing languages are.

### 2.1. For more info or just to repeat and confirm the info on how to use this online development environment, plus super short intro on classes, methods and main methods in Java check my first tutorial in this series:
Write your first lines of Java code right NOW, in less than 5 minutes:  
YouTube:  
https://www.youtube.com/watch?v=lRNwvhACfpA&t=138s  
Github:  
https://github.com/simeonyaniliev/first-lines-java  

## 4. Once there, we need to write some code.

### 4.1 Lets write or copy the "WoW" section of our program and click the "Run" button:  

```java
/* "public class Main {}" - This is how you can define a class in Java:*/
public class Main
{
	// "public static void main() {} " - This is how you can define a method in Java:
	// Note: this is the main method the starting point of a program in Java
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
	  	String wowInput = System.console().readLine();
	  	System.out.println("Wow: " + wowInput);
	
		// console execution paragraph ends
	}
}
```

### 4.1 Lets write or copy the "Hi" section and click "Run" button:  


```java
public class Main
{
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
    		String wowInput = System.console().readLine();
    		System.out.println("Wow: " + wowInput);
	
		// -- "Hi" section
		System.out.print("Enter your first name:  ");
		String firstName = System.console().readLine();
		System.out.println("Hi " + firstName);
     
		// console execution paragraph ends
	}
}
```

### 4.1 Lets write or copy the "Authenticate" section and click "Run" button:


```java
public class Main
{
	public static void main(String[] args)  {
	
		// console execution paragraph starts
		// -- "Wow" section
		System.out.print("Enter something for a test:  ");
    		String wowInput = System.console().readLine();
    		System.out.println("Wow: " + wowInput);
		
		// -- "Hi" section
    		System.out.print("Enter your first name:  ");
    		String firstName = System.console().readLine();
    		System.out.println("Hi " + firstName);
	
		// -- "Authenticate" section
    		System.out.print("To authenticate, enter your last name:  ");
    		String lastName = System.console().readLine();
	
		if (lastName.equals("Iliev"))  {  // write your own family name here
	       		System.out.println("Regards boss: " + lastName);
		} else {
			System.out.println("Regards : " + lastName);
		}
	
		// console execution paragraph ends

	}
}
```

## 5. What to do next if I want to become Java developer.
## 5.1. Go for example to this website: http://www.tutorialspoint.com/java/
or to: https://www.w3schools.com/java  or find another good online Java tutorial or educational material and follow it.
Or using application on your phone (super nice option), like this one: https://www.sololearn.com/
## 5.2 Check my other tutorials that will follow up on the topic

