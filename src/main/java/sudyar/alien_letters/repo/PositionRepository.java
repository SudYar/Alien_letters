package sudyar.alien_letters.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sudyar.alien_letters.entities.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}