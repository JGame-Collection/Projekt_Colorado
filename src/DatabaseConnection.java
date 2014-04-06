
public class DatabaseConnection {

	public DatabaseConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean loginUser(String username, String password){
		 return username.equals("root") && password.equals("toor");
	}

}
