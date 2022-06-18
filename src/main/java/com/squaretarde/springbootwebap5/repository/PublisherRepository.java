package com.squaretarde.springbootwebap5.repository;

import com.squaretarde.springbootwebap5.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
