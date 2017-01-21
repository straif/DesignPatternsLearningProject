package patterns.DataAccessObject;

public class Book {
	
	//this is the Object Model
	
	int id;
	String authors;
	String title;
	
	public Book(int id, String authors, String title) {
		super();
		this.id = id;
		this.authors = authors;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
