package sec03.exam04;

public class BoardExample {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		Board b2 = new Board("제목", "내용");
		Board b3 = new Board("제목", "내용", "글쓴이");
		
		System.out.println(b1.title);
		System.out.println(b1.contents);
		System.out.println(b1.writter);
		System.out.println(b1.readingTimes);
		System.out.println();
		
		System.out.println(b2.title);
		System.out.println(b2.contents);
		System.out.println(b2.writter);
		System.out.println(b2.readingTimes);
		System.out.println();
		
		System.out.println(b3.title);
		System.out.println(b3.contents);
		System.out.println(b3.writter);
		System.out.println(b3.readingTimes);
		System.out.println();
		

	}

}
