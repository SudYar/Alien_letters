package sudyar.alien_letters.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sudyar.alien_letters.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {


}