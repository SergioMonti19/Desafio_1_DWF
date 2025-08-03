package com.letrasvivas.bookapi.repository;

import com.letrasvivas.bookapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // Método personalizado para buscar por título
    List<Book> findByTitleContainingIgnoreCase(String title);
}

