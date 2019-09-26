package wp.javaconfig;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="books")
public class BookModel {
	@Id
	private String bookid;
	
	@Pattern(regexp="[a-zA-Z]*", message="Only Alphabates Allowed")//only alphbates
	@Size(min=2,max=10, message="Your Name Is Invalid , Please Use 2-10 Chars only")
	private String bname;
	private String bauthor;
	
	@Min(value=0, message="Negative Pricing Is Not possible")
	private String price;
	
	
	private String subject;
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "BookModel [bookid=" + bookid + ", bname=" + bname + ", bauthor=" + bauthor + ", price=" + price
				+ ", subject=" + subject + "]";
	}
	public BookModel(String bookid, String bname, String bauthor, String price, String subject) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.price = price;
		this.subject = subject;
	}
	public BookModel() {
		super();
	}
	
}
