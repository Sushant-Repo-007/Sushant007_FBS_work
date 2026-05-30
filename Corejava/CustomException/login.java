import java.util.Scanner;

class InvalidUsernameException extends Exception {

	String Username;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public InvalidUsernameException(String username) {
		super();
		Username = username;
	}

	@Override
	public String toString() {
		return "InvalidUsernameException Username=" + Username;
	}

}// InvalidUsername Exception here

class InvalidPasswordException extends Exception {

	String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public InvalidPasswordException(String password) {
		super();
		Password = password;
	}

	@Override
	public String toString() {
		return "InvalidPasswordException Password=" + Password;
	}

} // InvalidPasswordException ends here

class Loginnew {

	String Username = "admin";
	String password = "12345"; // hardcoded values here 

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Loginnew(String username, String password) {
		super();
		this.Username = username;
		this.password = password;
	}

	public void validateUsername(String enteredUsername) throws InvalidUsernameException {

		if (enteredUsername.equals(Username)) {
			System.err.println("Username Matched here ");

		} else {

			throw new InvalidUsernameException("Please Enter a Valid Username here :");

		}

	} // ValidateUsername Methods ends here

	public void validatePassword(String password2) throws InvalidPasswordException {

		if (password2.equals(password)) {
			System.out.println("Password matched Successfully");

		} else {

			throw new InvalidPasswordException("Please Enter a Valid Password here ");

		}

	}

} // Class Login ends here

public class login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Login Validations Using Customised Exceptions here :");

		System.out.println("-----------------------------------------------------");

		System.out.println("Enter Username here ");
		String username = sc.next();

		// user Input here
		System.out.println("Ener the password here ");

		String password = sc.next(); // user Input here

		Loginnew lo = new Loginnew(username,password);

		try {
			lo.validateUsername(username);
		} catch (InvalidUsernameException e) {

			System.out.println(e.getMessage());

		}
		try {
			lo.validatePassword(password);
		} catch (InvalidPasswordException e) {

			System.out.println(e.getMessage());

		}

		System.out.println("-----------------------------------------------------");

	}

}// class Login ends here
