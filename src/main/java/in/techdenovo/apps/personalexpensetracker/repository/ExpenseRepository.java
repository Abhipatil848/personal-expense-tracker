package in.techdenovo.apps.personalexpensetracker.repository;

import in.techdenovo.apps.personalexpensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
