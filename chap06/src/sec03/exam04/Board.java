package sec03.exam04;

public class Board {
	
	String title;
	String contents;
	String writter;
	int readingTimes;
	
	Board(){
		
	}
	
	Board(String title, String contents){
		this(title, contents, null);	
	}
	
	Board(String str1, String str2, String str3){
		this.title = str1;
		this.contents = str2;
		this.writter = str3;
	}
	
	

}
