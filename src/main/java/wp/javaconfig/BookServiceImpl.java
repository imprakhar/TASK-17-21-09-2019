package wp.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAOInterface bookDAOInterface;
	
	public void insertBook(BookModel book) {	
		bookDAOInterface.insertBook(book);
	}

	public void deleteBook(String code) {
		bookDAOInterface.deleteBook(code);
	}

	public BookModel getBookById(String code) {
		return bookDAOInterface.getBookById(code);
	}

	public List<BookModel> getAllBooks() {
		return bookDAOInterface.getAllBooks();
	}

	public void updateBook(BookModel book) {
		bookDAOInterface.updateBook(book);
	}

}
