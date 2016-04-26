package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import model.entities.Author;
import java.util.List;
import service.AuthorRepositoryService;

/**
 *
 * @author gilson
 */
@RestController
@RequestMapping("author")
public class AuthorController {
    
    @Autowired
    private AuthorRepositoryService authorRepositoryService;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Author> index() {
        return this.authorRepositoryService.findAll();
    }
}
