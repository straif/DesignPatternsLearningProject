package Main;

import patterns.DataAccessObject.Book;
import patterns.DataAccessObject.BookDAO;
import patterns.DataAccessObject.BookStub;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO books = new BookStub();
		
		for(Book b: books.getAllBooks()){
			System.out.println("Book no. " + b.getId() + ": \"" + b.getTitle() + "\" by " + b.getAuthors());
		}

	}

}
