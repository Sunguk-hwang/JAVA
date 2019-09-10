package sec06.exam06;

public class Board {
	private String title;
	private String content;
	private String writter;
	private boolean open;
	private int hitCount;
	
	// Source >> Generate Getters and Setters 
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
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	public boolean isOpen() { // boolean타입은 get >> is
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	

}
