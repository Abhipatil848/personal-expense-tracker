package in.techdenovo.apps.personalexpensetracker.repository;

import in.techdenovo.apps.personalexpensetracker.model.Category;
import in.techdenovo.apps.personalexpensetracker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
