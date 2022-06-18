package com.squaretarde.springbootwebap5.repository;

import com.squaretarde.springbootwebap5.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
