import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class _2503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int p=1; p<=9; p++) {
			String input = ""+p;
			for(int q=1; q<=9; q++) {
				if(p != q) {
					input += q;
					for(int r=1; r<=9; r++) {
						if(p!=r && q!=r) {
							input += r;
							list.add(input);
							input=input.replace(""+r, "");
						}
					}
					input=input.replace(""+q, "");
				}
			}
		}
		
		for(int p=0; p<t; p++) {
			Iterator<String> iter =  list.iterator();
			String str = sc.next();
			String strike = sc.next();
			String ball = sc.next();
			
			while(iter.hasNext()) {
				String s = iter.next();
				if(!strike.equals(check(str, s).split(" ")[0]) || !ball.equals(check(str, s).split(" ")[1])) {
					iter.remove();
				}
			}
		}
		System.out.println(list.size());
		sc.close();
	}
	
	static String check(String str1, String str2) {
		int strike = 0;
		int ball = 0;
		for(int p=0; p<str1.length(); p++) {
			char c1 = str1.charAt(p);
			for(int q=0; q<str2.length(); q++) {
				if(c1==str2.charAt(q) && p==q) {
					strike++;
				} else if(c1 == str2.charAt(q)) {
					ball++;
				}
			}
		}
		return strike+" "+ball;
	}
}