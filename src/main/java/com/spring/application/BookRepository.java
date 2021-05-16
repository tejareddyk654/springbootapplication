package com.spring.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BookRepository extends JpaRepository<Book, String>{
	
	@Query("SELECT l from Book l where l.genre=?1")
	public List<Book> findbytype(String genre);
}
