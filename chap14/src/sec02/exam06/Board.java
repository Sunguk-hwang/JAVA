package sec02.exam06;

import java.io.Serializable;

public class Board implements Serializable {
	
	private int b_no;
	private String title;
	private String content;
	
	public Board() {
	}
	
	public Board(int b_no, String title, String content) {
		super();
		this.b_no = b_no;
		this.title = title;
		this.content = content;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}