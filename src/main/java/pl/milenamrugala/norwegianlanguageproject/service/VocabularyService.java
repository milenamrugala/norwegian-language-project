package pl.milenamrugala.norwegianlanguageproject.service;

import pl.milenamrugala.norwegianlanguageproject.model.Vocabulary;

import java.util.List;

public interface VocabularyService {

    List<Vocabulary> getAllVocabularies();

    Vocabulary saveVocabulary(Vocabulary vocabulary);

    Vocabulary updateVocabulary(Vocabulary vocabulary);

    Vocabulary getVocabularyById(Long id);

    void deleteById(Long id);
}
