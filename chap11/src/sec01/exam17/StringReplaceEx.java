package sec01.exam17;

public class StringReplaceEx {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String[] replaceStr = {"자바","니다", "는"};
		String newStr = "";
		for(int i=0; i<replaceStr.length; i++) {
			newStr = oldStr.replace(replaceStr[i], "a");
		}
		System.out.println(newStr);
	}

}
