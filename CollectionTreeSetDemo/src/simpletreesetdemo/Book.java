package simpletreesetdemo;

public class Book {

	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
	
}
