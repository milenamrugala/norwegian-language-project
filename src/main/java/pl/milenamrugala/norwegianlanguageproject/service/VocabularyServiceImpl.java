package pl.milenamrugala.norwegianlanguageproject.service;

import org.springframework.stereotype.Service;
import pl.milenamrugala.norwegianlanguageproject.model.Vocabulary;
import pl.milenamrugala.norwegianlanguageproject.repository.VocabularyRepository;

import java.util.List;

@Service
public class VocabularyServiceImpl implements VocabularyService {

    private VocabularyRepository vocabularyRepository;

    public VocabularyServiceImpl(VocabularyRepository vocabularyRepository) {
        this.vocabularyRepository = vocabularyRepository;
    }

    @Override
    public List<Vocabulary> getAllVocabularies() {
        return vocabularyRepository.findAll();
    }

    @Override
    public Vocabulary saveVocabulary(Vocabulary vocabulary) {
        return vocabularyRepository.save(vocabulary);
    }

    @Override
    public Vocabulary updateVocabulary(Vocabulary vocabulary) {
        return vocabularyRepository.save(vocabulary);
    }

    @Override
    public Vocabulary getVocabularyById(Long id) {
        return vocabularyRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        vocabularyRepository.deleteById(id);

    }
}
