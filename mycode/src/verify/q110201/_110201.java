package verify.q110201;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class _110201 {

	public static void main(String[] args) {
		Date now1 = new Date();
		//String str = now1.toString();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String now1Str = sdf.format(now1);
		
		System.out.println(now1Str);
		System.out.println();
		
		
		Calendar now2 = Calendar.getInstance();
		int year = now2.get(Calendar.YEAR);
		int week = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(Calendar.WEDNESDAY);
		
		//System.out.println(now2.get(Calendar.YEAR)+"년 " + "0"+(now2.get(Calendar.MONTH)+1)+"월 " + now2.get(Calendar.DAY_OF_MONTH)+"일 ");

	}

}
