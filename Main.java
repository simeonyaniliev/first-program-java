public class Main
{
  /**
  * Note: while writing the code in the method bellow,
  * after writing each section in from the execution paragraph, 
  * click run/execute button to test your application state so far.
  */
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
