package sec02.exam06;

public class ControllerEx {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();

	}

}
