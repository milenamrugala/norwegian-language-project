package pl.milenamrugala.norwegianlanguageproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.milenamrugala.norwegianlanguageproject.model.Vocabulary;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
}
