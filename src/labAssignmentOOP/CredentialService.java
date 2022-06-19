package labAssignmentOOP;

import java.util.Random;

public class CredentialService {
	    public final String companyName = "ABC";
	    
	  //Combine all elements to generate an Email
	    public String generateEmailAddress(final String firstName, final String lastName, final String deptName) {
	        String Emailadd = "";
	        Emailadd = String.valueOf(firstName.toLowerCase()) + lastName.toLowerCase() + "@" + deptName + "." + "ABC" + ".com";
	        return Emailadd;
	    }
	    
	    //Generate a Random Password
	    public char[] generatePassword() {
	        final char[] password = new char[8];
	        final String captialletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        final String smallletters = "abcdefghijklmnopqrstuvwxyz";
	        final String numbers = "0123456789";
	        final String characters = "!@#$%^&*_+'?/,.<>";
	        final String Totalvalues = String.valueOf(captialletters) + smallletters + numbers + characters;
	        final Random rnd = new Random();
	        for (int i = 0; i < 8; ++i) {
	            password[i] = Totalvalues.charAt(rnd.nextInt(Totalvalues.length()));
	        }
	        return password;
	    }
	    
	  
	    public void showCredentials(final Employee employee, final String Emailadd, final char[] generatedPasswrd) {
	        System.out.println("Dear " + employee.getfirstName() + " your generated credentials are as follows ");
	        System.out.println("Your Email Address --> " + Emailadd);
	        System.out.print("Your Password --> ");
	        System.out.print(generatedPasswrd);
	    }
	}

