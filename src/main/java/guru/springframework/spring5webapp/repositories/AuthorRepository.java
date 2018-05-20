package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Radu on 5/20/2018.
 */
public interface AuthorRepository  extends CrudRepository<Author, Long> {
}
