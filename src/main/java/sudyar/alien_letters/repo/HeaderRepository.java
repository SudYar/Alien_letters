package sudyar.alien_letters.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sudyar.alien_letters.entities.Header;

public interface HeaderRepository extends JpaRepository<Header, String> {
    Header findByCode(String code);

}