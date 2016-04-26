package projeto.interdisciplinar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.AuthorRepositoryService;

@SpringBootApplication
@ComponentScan({"controller", "config"})
public class MackbookStoreServerApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(MackbookStoreServerApplication.class, args);
	}
}
