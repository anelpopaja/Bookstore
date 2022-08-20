package local.rps.bookstore.service;

import local.rps.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    @Autowired
    BookRepository bookRepository;
}
