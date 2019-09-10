package sec03.exam03;

public class Ex {

	public static void main(String[] args) {
		HttpServlet httpservlet = new LoginServlet();
		LoginServlet loginservlet = (LoginServlet) httpservlet;
		
		if(loginservlet instanceof HttpServlet) {
			response(new LoginServlet());
		}
		
		JoinServlet joinservlet = new JoinServlet();
		response(joinservlet);
		
		

	}
	
	public static void response(HttpServlet servlet) {
		servlet.service();
	}

}
