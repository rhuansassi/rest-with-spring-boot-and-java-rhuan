package br.com.rhuanjava.repositories;

import br.com.rhuanjava.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}