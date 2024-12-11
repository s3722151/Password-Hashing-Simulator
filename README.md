# Password-Hashing-Simulator
Context  I am nearly going to graduate and need to do 1 more advanced IT subject. 
Start Date: 12th December 2024
Due Date: 30th December 2024

System requirements: Eclipse 

# Summary
This project involves creating a Password Hashing Simulator in Java to understand and implement the cryptographic hashing process using SHA-256. 
It will include user input handling, password hashing, and optional features like salting and password verification. 
The project is designed to be completed within two weeks, excluding holidays on 25th and 26th December.

# Step-by-Step Example
1.User Input:
  The program prompts: Enter your password:
  User types: mypassword123
2. Hashing Process:
  The program generates a SHA-256 hash:
  f8c3bf243f30b85eeb76d8d8eb03a48e3a6d... (truncated for brevity).
Output
  Original Password: mypassword123  
  Hashed Password: f8c3bf243f30b85eeb76d8d8eb03a48e3a6d...

3. Optional Feature - Salting:
Program generates a random "salt" (e.g., abc123) and appends it to the password before hashing.
Output:
  Salt: abc123  
  Salted Password Hash: d54d7f7c3a8d5c9...

4.Optional Feature - Verification:
  Program stores the hash and prompts the user to verify their password.
  User enters: mypassword123
  Program re-hashes with the salt and matches it to the stored hash.
  Output: Password Verified!
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Log of working on the project 
12/12/2024 
I just created the repository. Creating the project requirements and cloning to my machine. 
