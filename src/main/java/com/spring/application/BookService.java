package com.spring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepository repo;
	
	public List<Book> ListAll(){
		return repo.findAll();
	}
	
	public void save(Book b) {
		repo.save(b);
	}
	
	public void update(Book b) {
		
	}
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	public Book getbyid(String id) {
		return repo.findById(id).get();
	}
	
    public List<Book> getByType(String genre){
    	return repo.findbytype(genre);
    }
    
}
