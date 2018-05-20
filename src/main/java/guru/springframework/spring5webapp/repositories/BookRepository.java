package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Radu on 5/20/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
