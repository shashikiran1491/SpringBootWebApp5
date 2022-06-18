package com.squaretarde.springbootwebap5.bootstrap;

import com.squaretarde.springbootwebap5.entity.Author;
import com.squaretarde.springbootwebap5.entity.Book;
import com.squaretarde.springbootwebap5.entity.Publisher;
import com.squaretarde.springbootwebap5.repository.AuthorRepository;
import com.squaretarde.springbootwebap5.repository.BookRepository;
import com.squaretarde.springbootwebap5.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = Publisher.builder()
                .name("HigginBothams")
                .addressLine("Magadi Road")
                .city("Bangalore")
                .state("Karnataka")
                .zip("560023")
                .build();


        Author author = Author.builder()
                .firstName("shashi")
                .lastName("kiran")
                .build();

        Book book = Book.builder()
                .title("JAVA SE8")
                .isbn("123")
                .build();

        Book book1 = Book.builder()
                .title("JAVA SE11")
                .isbn("123")
                .build();


        author.getBooks().add(book);
        book.getAuthors().add(author);

        book.setPublisher(publisher);


        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);

    }
}
