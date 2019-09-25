package wp.javaconfig;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO implements BookDAOInterface {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertBook(BookModel book) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(book);
		tr.commit();
		session.close();
	}

	public void deleteBook(String code) {
		Session session = sessionFactory.openSession();
		BookModel book = session.get(BookModel.class, code);
		Transaction tr = session.beginTransaction();
		session.delete(book);
		tr.commit();
		session.close();
	}

	public BookModel getBookById(String code) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		BookModel book = session.get(BookModel.class, code);
		tr.commit();
		session.close();
		return book;
	}

	public List<BookModel> getAllBooks() {
		Session session = sessionFactory.openSession();
		Criteria cr=session.createCriteria(BookModel.class);
		List<BookModel> book= cr.list();
		session.close();
		return book;
	}

	public void updateBook(BookModel book) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(book);
		tr.commit();
		session.close();
	}

}
