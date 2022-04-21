package client;

import java.util.ArrayList;
import java.util.List;

import bookstoreDomain.Book;
import bookstoreDomain.Chapter;
import bookstoreDomain.Publisher;
import services.BookStoreService;

public class bookstoreClient {

	public static void main(String[] args) {
		
		
BookStoreService bookStoreService = new BookStoreService();
		
		Publisher publisher = new Publisher("OREI", "OReilly Publications Ltd.");
		
		Book book = new Book("34522093093IHFDJ", "Java Bible", publisher);
		
		Chapter chapter1 = new Chapter("What is Java", 1);
		Chapter chapter2 = new Chapter("Datatypes", 2);
		
		List<Chapter> chapters = new ArrayList<Chapter>();
		chapters.add(chapter1);
		chapters.add(chapter2);
		
		book.setChapters(chapters);
		
		/*
		 * Persist Object Graph
		 */
//		bookStoreService.persistObjectGraph(book);
		
		/*
		 * Retrieve Object Graph
		 */
//		System.out.println(bookStoreService.retrieveObjectGraph("9876123456"));  book id is not present in database
		System.out.println(bookStoreService.retrieveObjectGraph("34522093093IHFDJ"));
	
	}
}