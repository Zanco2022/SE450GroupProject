import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public final class Database {

	private static Database instance;
	private final HashMap<String, User> database = new HashMap<>();
	
	private Database() {
	}
	
	public static Database getInstance() {
		//1. Follow a Singleton Design Pattern.
		//2. If instance is null, create a new Database.
		//3. Return Database instance if instance is not null.
	}
	
	public User getUser(String username) {
		//1. If user exists, fetch user from HashMap with key=[username] and return it
		//2. Return null if user does not exist.
	}
	
	public void storeUser(User user) {
		//1. Create a new file if file does not exist.
		//2. If file exist, append the user data at end of the file.
		//3. Put user data into HashMap.
	}
	
	public void editUser(User userIn, String newPassword) {
		//1. Get user from HashMap
		//2. Set new password for the user
		//3. Update HashMap with new user data
		//4. Update File data
	}
	
	public void loadDatabase() {
		//1. Create a new file if file does not exist.
		//2. If file exist, read the data and store the data into HashMap.
	}
}
