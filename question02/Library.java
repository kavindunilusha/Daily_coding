package question02;

import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		HashMap<Integer,Book> bookList = new HashMap<>();
		
		Book book1 = new Book("Harr Potter","ISBN12345");
		bookList.put(1, book1);
		
		Book book2 = new Book("Rings of powers",123456);
		bookList.put(2, book2);
		
		for(int id : bookList.keySet()) {
			Book value = bookList.get(id);
			System.out.println("Book id :" +id+ "and the iSBN is :"+value.getISBN());
			
		}

	}

}
