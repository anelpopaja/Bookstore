package local.rps.bookstore.controller;

import local.rps.bookstore.model.Author;
import local.rps.bookstore.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping("/allAuthors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAutomobils();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/addAuthor")
    public void addAuthor(@RequestBody Author author) {
         authorService.addAuthor(author);
    }
}
