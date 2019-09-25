package wp.javaconfig;

import java.util.List;

public interface BookDAOInterface {
	public void insertBook(BookModel book);
	public void deleteBook(String code);
	public void updateBook(BookModel book);
	public BookModel getBookById(String code);
	public List<BookModel> getAllBooks();
}
