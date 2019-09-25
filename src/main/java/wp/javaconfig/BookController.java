package wp.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("showall")
	public ModelAndView showAllBooks()
	{
		List<BookModel> book= bookService.getAllBooks();
		ModelAndView mv= new ModelAndView("booklist");
		mv.addObject("book", book);
		return mv;
	}
	@RequestMapping("addbook")
	public String add()
	{
		return "addBook";
	}
	
	@RequestMapping("viewbook")
	public String view()
	{
		return "bookbyid";
	}
	
	@RequestMapping("removebook")
	public ModelAndView deleteBook(@RequestParam ("id") String code)
	{
		bookService.deleteBook(code);
		ModelAndView mv= new ModelAndView("redirect:showall");
		return mv;
	}
	
	@RequestMapping("updatebook")
	public ModelAndView updateForm(@RequestParam ("id") String code)
	{
		BookModel book=bookService.getBookById(code);
		ModelAndView mv= new ModelAndView("updateform");
		mv.addObject("bookinfo",book);
		return mv;
	}
	
	@RequestMapping("addbook1")
	public ModelAndView AddBook(@ModelAttribute("book") BookModel book)
	{
		bookService.insertBook(book);
		ModelAndView mv=new ModelAndView("redirect:showall");
		return mv;
	}
	
	@RequestMapping("searchbook")
	public ModelAndView searchBookById(@RequestParam ("id") String code)
	{
		BookModel book=bookService.getBookById(code);
		ModelAndView mv= new ModelAndView("showbook");
		mv.addObject("bookinfo",book);
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView updateBook(@ModelAttribute("book") BookModel book)
	{
		bookService.updateBook(book);
		ModelAndView mv= new ModelAndView("redirect:showall");
		return mv;
	}
	
}
