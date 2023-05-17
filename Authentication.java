
public class Authentication {
	
	public Authentication() {
		
	}
	
	public User login(String username, String password) {
		//1. Get user data from the Database class.
		//2. Authenticate incoming parameters with database.
		//3. Return a user object if successful, else return null.
		return null;
	}
	
	public void signup(String username, String password) {
		//1. Create a user object with incoming parameter.
		//2. Call Database class storeUser() method.
	}
	
	public void forgetPassword(String username) {
		//1. Get user data from the Database class.
		//2. Authenticate incoming parameter with database.
		//3. If user exist, allow to change password.
		//4. Else, display a message with "No such user".
	}
	
	public void resetPassword(User user, String newPassword) {
		//1. Reset password with new password for the given user
	}

}
