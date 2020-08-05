package com.slay.initialcrud.service;

import com.slay.initialcrud.domain.Author;
import com.slay.initialcrud.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        super();
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> list() {
        return authorRepository.findAll();
    }
}
