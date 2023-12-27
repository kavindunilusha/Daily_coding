package question02;

public class Book {
	private Object bookTitle;
	private Object bookISBN;
	
	public Book(Object bookTitle, Object bookISBN) {
		super();
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	}
	
	public Object getISBN() {
		return this.bookISBN;
	}
	
	
	

}
