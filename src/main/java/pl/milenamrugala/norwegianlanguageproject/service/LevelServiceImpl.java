package pl.milenamrugala.norwegianlanguageproject.service;

import org.springframework.stereotype.Service;
import pl.milenamrugala.norwegianlanguageproject.model.Level;
import pl.milenamrugala.norwegianlanguageproject.repository.LevelRepository;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {

    private LevelRepository levelRepository;

    public LevelServiceImpl(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }


    @Override
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public Level savelevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Level updateLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Level getLevelById(Long id) {
        return levelRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        levelRepository.deleteById(id);
    }
}
