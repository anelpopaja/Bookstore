package local.rps.bookstore.service;

import local.rps.bookstore.model.Author;
import local.rps.bookstore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAutomobils() {
        return this.authorRepository.findAll();
    }

    public void addAuthor(Author author) {
        this.authorRepository.save(author);
    }
}
