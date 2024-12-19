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

2.Hashing Process:
  The program generates a SHA-256 hash:
  f8c3bf243f30b85eeb76d8d8eb03a48e3a6d... (truncated for brevity).

Output

Original Password: mypassword123  
Hashed Password: f8c3bf243f30b85eeb76d8d8eb03a48e3a6d...

3.Optional Feature - Salting:

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

14/12/2024
Had to fix issue of creating java project within the cloned folder. 
Steps to Fix the Issue
1. Close the Existing Project in Eclipse
	In Eclipse, go to the Project Explorer or Package Explorer view.
	Check if there is already a project named Password-Hashing-Simulator listed.
	Right-click the project and select Close Project (if it's open). This prevents conflicts 	while re-importing the project.
2. Re-import the Project
	Go to File > Import > Existing Projects into Workspace.
	Select the root directory as the location of your cloned Password-Hashing-Simulator folder.
	Ensure the project Password-Hashing-Simulator is selected in the list.
	Check the option Copy projects into workspace if you want Eclipse to manage a copy of the 	project instead of modifying the original folder.
	Click Finish.
3. Fix the .gitignore and .project Files
	Open the .gitignore file in the cloned folder and ensure it excludes only the bin/ folder 	(as specified: {/bin/}). No changes are needed here unless the folder is misconfigured.
	Review the .project file content. The file you posted looks correct and defines this 	folder as a Java project. Eclipse should recognize it automatically.
4. Verify and Configure the Build Path
	After importing the project:
	Right-click the project in the Project Explorer.
	Select Build Path > Configure Build Path.
	Check the following:
	A JRE System Library is listed under the Libraries tab. If not, add it by clicking Add 	Library > JRE System Library.
	The Source tab should include a source folder (e.g., src).
	Click Apply and Close.
5. Clean and Build the Project
	Go to Project > Clean in the Eclipse menu bar.
	Select the Password-Hashing-Simulator project and clean it.
	Eclipse will rebuild the project automatically.
6. Run the Project
	Ensure that the folder has a source folder (e.g., src) containing your Java files.
	Right-click a Java file with a main method.
	Select Run As > Java Application.

Also learnt to close a project in Project Explorer.

15/12/2024

Just gonna make some comments in main file.

16/12/2024

Added some clarification to documentation doc. 

17/12/2024

Looked at some references. Looked at the code and added the method to hash. 

18/12/2024

Pretty exhausted. Just updated the README file.

19/12/2024
Revised the number systems, binary to decimal conversions and what is message digest.
