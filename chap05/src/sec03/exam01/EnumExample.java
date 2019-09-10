package sec03.exam01;

public class EnumExample {

	public static void main(String[] args) {
		
		Week today = Week.TUESDAY;
		LoginResult result = LoginResult.LOGIN_SUCCESS;
		
	}
	
	public static LoginResult login(String id, String pw) {
		
		if(id.equals("admin")) {
			if(pw.equals("12345")) {
				return LoginResult.LOGIN_SUCCESS;
			}
			else {
				return LoginResult.LOGIN_FAIL_PW;
			}
		}
		else {
			return LoginResult.LOGIN_FAIL_ID;
		}
		
	}

}
