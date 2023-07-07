package pl.milenamrugala.norwegianlanguageproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.milenamrugala.norwegianlanguageproject.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByLevel_Name(String levelName);
}
