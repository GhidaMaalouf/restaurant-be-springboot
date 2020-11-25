package restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.dbModel.VisitLog;

import java.util.UUID;

public interface VisitLogRepository extends JpaRepository<VisitLog, UUID> {
}
