package in.techdenovo.apps.personalexpensetracker.repository;

import in.techdenovo.apps.personalexpensetracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
