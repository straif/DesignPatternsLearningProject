package patterns.DataAccessObject;

import java.util.List;

public interface BookDAO {
	
	public List<Book> getAllBooks();
	public Book getBook(int id);
	public void deleteBook(Book book);

}
