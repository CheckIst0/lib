package ru.chel.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.chel.library.core.service.BookService;
import ru.chel.library.db.entity.Book;

@RestController
@RequestMapping("/lib/books")
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/add")
    public void add(@RequestBody Book book) {
        service.add(book);
    }

    @GetMapping("/get/{id}")
    public Book getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public Book update(@RequestBody Book book) {
        return service.update(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
