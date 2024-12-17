import java.util.Scanner;  // Import the Scanner class
import java.security.MessageDigest; //(for hashing).

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Phase 1:User input
		Scanner passwordObject = new Scanner(System.in);
		System.out.println("Please input your password here");
		String passwordInput = passwordObject.nextLine(); //Read user input
		
		//Phase 2: Generate Hash
		
		//Optional tasks here
		System.out.println("Optional code is here");
	}
	
//INSERT METHODS HERE

}
//REFERENCES
/* 
Simple Hash
https://www.w3schools.com/java/tryjava.asp?filename=demo_ref_string_hashcode

What is bytes
https://www.youtube.com/watch?v=Dnd28lQHquU
	What is the number system: https://www.youtube.com/watch?v=FFDMzbrEXaE

What is SHA-256
https://medium.com/@AlexanderObregon/what-is-sha-256-hashing-in-java-0d46dfb83888

How to hash
https://www.geeksforgeeks.org/sha-256-hash-in-java/

 */
