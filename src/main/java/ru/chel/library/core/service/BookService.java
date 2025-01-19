package ru.chel.library.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.chel.library.db.entity.Book;
import ru.chel.library.db.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public void add(Book book) {
        repository.save(book);
    }

    public Book getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Book update(Book newInfo) {
        Book book = repository.findById(newInfo.getId()).orElseThrow();
        book.setAuthor(newInfo.getAuthor());
        book.setName(newInfo.getName());
        book.setGenre(newInfo.getGenre());
        book.setQuantity(newInfo.getQuantity());
        return repository.save(book);
    }
}
