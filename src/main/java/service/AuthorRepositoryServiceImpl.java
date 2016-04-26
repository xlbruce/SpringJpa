package service;

import java.util.List;
import model.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AuthorRepository;


public class AuthorRepositoryServiceImpl implements AuthorRepositoryService {
    private AuthorRepository authorRepository;

    public AuthorRepositoryServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public AuthorRepositoryServiceImpl() {
    }
    
    
    
    
    
    @Override
    public List<Author> findAll() {
        return (List<Author>) authorRepository.findAll();
    }
    
}
