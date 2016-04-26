package service;

import java.util.List;
import model.entities.Author;
import org.springframework.stereotype.Service;

/**
 *
 * @author gilson
 */
public interface AuthorRepositoryService {
    
    List<Author> findAll();
    
}
