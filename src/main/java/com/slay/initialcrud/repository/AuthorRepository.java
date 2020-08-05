package com.slay.initialcrud.repository;

import com.slay.initialcrud.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
