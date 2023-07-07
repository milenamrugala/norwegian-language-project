package pl.milenamrugala.norwegianlanguageproject.service;

import pl.milenamrugala.norwegianlanguageproject.model.Level;

import java.util.List;

public interface LevelService {

    List<Level> getAllLevels();

    Level savelevel(Level level);

    Level updateLevel(Level level);

    Level getLevelById(Long id);

    void deleteById(Long id);


}
