package com.esi.onlinestore;

import com.esi.onlinestore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {
}
