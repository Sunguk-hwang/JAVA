package sec05.exam04;

public class CalendarExample {

	public static void main(String[] args) {
		
		//Calendar cal _1 = new Calendar();
		Calendar cal_2 = Calendar.getInstance();
		Calendar cal_3 = Calendar.getInstance();
		
		if(cal_2 == cal_3) {
			System.out.println("같다!");
		}
		else {
			System.out.println("다르다!");
		}
		

	}

}
