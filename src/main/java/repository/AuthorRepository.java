package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.entities.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gilson
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    
}
