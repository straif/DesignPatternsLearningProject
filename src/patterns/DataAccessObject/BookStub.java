package patterns.DataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class BookStub implements BookDAO {
	
	//imitate DB
	List<Book> books;
	
	public BookStub(){
		books = new ArrayList<Book>();
		
		//populate the "DB"
		Book book1 = new Book(1, "Bruce Eckel", "Thinking in Java");
		Book book2 = new Book(2, "Douglas Crockford", "JavaScript: The Good Parts");
		books.add(book1);
		books.add(book2);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return books.get(id);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		books.remove(book.id);
		System.out.println("Book number " + book.id + " deleted!");
	}

	

}
