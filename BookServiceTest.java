package com.library.testserviceimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import com.library.util.BookConverter;

@SpringBootTest
public class BookServiceTest {
	
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookConverter bookConverter;
	
	@MockBean
	private BookRepository bookRepository;
	
	@Test
	void testSaveBook() {
		Book book =new Book();
		book.setBookTitle("Microprocessor");
		book.setBookAuthor("Hana Mathur");
		book.setBookPublication("R.S Sinha");
		book.setBookCategory("Computer");
		book.setPrice(255);
		
		Mockito.when(bookRepository.save(book)).thenReturn(book);
		assertThat(bookService.addBook(book)).isEqualTo("Book details saved successfully");
		
	}
	
	/*@Test
	void getBookByIdTest() {
		Book book=bookRepository.findById(1).get();
		assertThat(book.getId()).isEqualTo(1);
		
	}*/
	
	@Test
	void getAllBooksTest() {
		List<Book> book=bookRepository.findAll();
		assertThat(book.size()).isEqualTo(0);
	}
	
	@Test
	@Rollback(false)
	public void deleteByIdTest() {
		Integer id=1;
		boolean isExistBeforeDelete=bookRepository.findById(id).isPresent();
		
		bookRepository.deleteById(id);
		
		boolean notExistAfterDelete=bookRepository.findById(id).isPresent();
		
		assertTrue(isExistBeforeDelete);
		assertFalse(notExistAfterDelete);
	}
	
	
	
	

}
