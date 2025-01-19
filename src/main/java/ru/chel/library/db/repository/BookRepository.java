package ru.chel.library.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chel.library.db.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
