package sec02.method;

public class StringMethodExample {

	public static void main(String[] args) {
		//.charAt : 문자열에서 특정 위치의 문자 추출
		String ssn = "123456-3234567"; //1,3: 남자, 2,4: 여자
		char var1 = ssn.charAt(7);
		System.out.println(var1);
		
		if(var1=='1' || var1=='3') {
			
			System.out.println("남자");
		}
		else {
			
			System.out.println("여자");
		}
		System.out.println();
		
		//.substring : 문자열에서 인덱스로 잘라내기
		String ssn1 = "123456-1234567";
		String ssn1_first = ssn1.substring(0, 6); //[0, 6) 문자열
		char[] arr_ssn1 = ssn1_first.toCharArray();
		for(int i=0; i<arr_ssn1.length; i++) {
			System.out.print(arr_ssn1[i] + " ");
		}
		System.out.println();
		System.out.println("******************");
		String ssn1_second = ssn1.substring(7); //index : 7 ~ 문자열
		System.out.println("ssn1_first: " + ssn1_first);
		System.out.println("ssn1_second: " + ssn1_second);
		System.out.println();
		
		//.split : 특정 구분자를 기준으로 분리시키기
		String words = "java,c,python,c#,c++";
		String[] array = words.split(",");
		for(String word : array) {
			System.out.println(word);
		}
		System.out.println();
		
		//.length() : 문자열의 길이(문자 수)
		String ssn2 = "123456-1234567";
		if(ssn2.length() == 14) { //String의 길이는 String 메소드를 이용하므로 .length가 아니라 .length()이다
			System.out.println("정상 입력");
		}
		else {
			System.out.println("입력 오류");
		}
		System.out.println();
		
		//.contains : 문자열 포함 여부(대, 소문자 구분 o)
		String sentence = "This program is written by Java";
		boolean isContain = sentence.contains("Java");
		System.out.println(isContain);
		System.out.println();
		
		//.toLowerCase() : 문자열 포함 여부(대, 소문자 구분 x) >> 소문자 변경 전처리
		sentence = sentence.toLowerCase(); //모두 소문자로 변경 먼저 한다.
		boolean isContain1 = sentence.contains("java");
		System.out.println(isContain1);
		System.out.println();
		
		//indexOf : 부분 문자열의 시작 위치 (찾는 문자열이 없으면 -1)
		String sentence1 = "Program is written by Java";
		int subIndex = sentence1.indexOf("is");
		System.out.println(subIndex);
		String subSentence = sentence1.substring(0, subIndex);
		System.out.println(subSentence);
		System.out.println();
		
		String fileName = "Hello.java";
		int subPoint = fileName.indexOf(".");
		String firstFileName = fileName.substring(0, subPoint);
		String secondFileName = fileName.substring(subPoint+1);
		System.out.println(firstFileName);
		System.out.println(secondFileName);
		System.out.println();
		
		String file = "my.word.file.docx";
		int lastPoint = file.lastIndexOf(".");
		String firstfile = file.substring(0, lastPoint);
		String secondfile = file.substring(lastPoint+1);
		System.out.println(firstfile);
		System.out.println(secondfile);
		System.out.println();
		
		//문자열 >> char배열 : .toCharArray
	}

}
