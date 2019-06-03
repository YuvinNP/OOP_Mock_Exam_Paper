package Question_2;

class Login {

	private static Login login;

	private Login() {
	}

	public static Login getInstance() {

		if (login == null) {
			login = new Login();
			System.out.println("Object Created");
		}
		return login;
	}

	public boolean ValidateUser(String user, String password) {

		return user.equals(password);
	}
	
}

public class Ques2a{
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			
			System.out.println(Login.getInstance().ValidateUser("Manju", "Manju"));
		}
	}
	
}

