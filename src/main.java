import java.util.Scanner;  // Import the Scanner class
import java.security.MessageDigest; //(for hashing).
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Phase 1:User input
		Scanner passwordObject = new Scanner(System.in);
		System.out.println("Please input your password here");
		String passwordInput = passwordObject.nextLine(); //Read user input
		
		//Phase 2: Generate Hash
		String hash = generateSHA256Hash(passwordInput);
        System.out.println("Input: " + passwordInput);
        System.out.println("SHA-256 Hash: " + hash);
		
		//Optional tasks here
        //Look at generating: Cryptographically secure pseudorandom number generator
        //Code to use: https://www.geeksforgeeks.org/random-vs-secure-random-numbers-java/
	}
	
//INSERT METHODS HERE
    public static String generateSHA256Hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8)); //Encode regardless of platforms decoding

            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }//End of method

}//End of class

//REFERENCES
/* 
Simple Hash
https://www.w3schools.com/java/tryjava.asp?filename=demo_ref_string_hashcode

What is bytes
https://www.youtube.com/watch?v=Dnd28lQHquU

How does binary work
https://www.youtube.com/watch?v=FrsgHUSZ_pc
	Convert binary to decimal
	https://www.youtube.com/watch?v=VLflTjd3lWA

What is the number system
https://www.youtube.com/watch?v=FFDMzbrEXaE

What is SHA-256 - used method
https://medium.com/@AlexanderObregon/what-is-sha-256-hashing-in-java-0d46dfb83888

How to hash
https://www.geeksforgeeks.org/sha-256-hash-in-java/

What is message digest
https://www.youtube.com/watch?v=y07_VBbsu-o
https://www.geeksforgeeks.org/what-is-message-and-message-digest-in-cryptography/

What is salting
https://en.wikipedia.org/wiki/Salt_(cryptography)

Why we hash - to avoid rainbow table attacks
https://www.beyondidentity.com/glossary/rainbow-table-attack
 */
