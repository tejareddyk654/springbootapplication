package com.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	private BookService service;
	
	@PostMapping(path= "/saveBook", consumes = "application/json", produces = "application/json")
	public void save(@RequestBody Book b) {
		service.save(b);
	}
	
	@PutMapping("/editBook")
	public Book replaceEmployee(@RequestBody Book newBook, @RequestParam String bookId) {
	    
	    Book b=service.getbyid(bookId);
	    b.setQuantity(newBook.getQuantity());
	    b.setBookName(newBook.getBookName());
	    b.setGenre(newBook.getGenre());
	    service.save(b);
	    return b;
	 }
	
	@DeleteMapping(path="/deleteBook")
	public void delete(@RequestParam String id) {
		service.delete(id);
	}
	
	@GetMapping("/getBooks")
	@ResponseBody
	public List<Book> listAll(){
		return service.ListAll();
	}
	
	@GetMapping("/getByType")
	public List<Book> getByType(@RequestParam String genre)
	{
		return service.getByType(genre);
	}
	
}
