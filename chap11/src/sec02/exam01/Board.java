package sec02.exam01;

import java.util.Date;

public class Board { // VO객체 : Value Object or DTO객체 : Data Transfer Object
	
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	
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
	public String getWriter() {
		return writer;
	}
	public void setWritter(String writter) {
		this.writer = writter;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

}
