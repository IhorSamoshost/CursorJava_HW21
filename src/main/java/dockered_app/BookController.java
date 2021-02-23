package dockered_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    BookDao bookDao;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookDao.findById(id).orElse(null);
    }

    @GetMapping("/books/in-use")
    public List<Book> getBooksInUse() {
        return bookDao.findAll().stream().filter(Book::isInUse).collect(Collectors.toList());
    }

    @GetMapping("/books/in-use/{id}")
    public Book changeMarkBookAsInUse(@PathVariable("id") Long id) {
        Book book = bookDao.getOne(id);
        book.setInUse(!book.isInUse());
        return bookDao.save(book);
    }
}
