package com.squaretarde.springbootwebap5.entity;

import lombok.*;
import org.springframework.cache.interceptor.CacheAspectSupport;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;
    private String title;
    private String isbn;

    @Builder.Default
    @ManyToMany
    @JoinTable( name="author_book", joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Publisher publisher;


    public void setPublisher(Publisher publisher) {
        if (publisher != null) {
            this.publisher = publisher;
            publisher.getBooks().add(this);
        }
    }
}




