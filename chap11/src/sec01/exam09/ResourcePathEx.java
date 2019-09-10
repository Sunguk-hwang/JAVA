package sec01.exam09;

public class ResourcePathEx {

	public static void main(String[] args) {
		Class carClass = Car.class;
		String photo1Path = carClass.getResource("photo1.jpg").getPath(); // Car클래스 기준으로 파일의 상대 경로를 " "에 넣는다.
		String photo2Path = carClass.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
