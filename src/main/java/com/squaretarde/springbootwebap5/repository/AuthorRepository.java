package com.squaretarde.springbootwebap5.repository;

import com.squaretarde.springbootwebap5.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
