package pl.milenamrugala.norwegianlanguageproject.service;

import pl.milenamrugala.norwegianlanguageproject.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category saveCategory(Category category);

    Category updateCategory(Category category);

    Category getCategoryById(Long id);

    void deleteById(Long id);

    List<Category> getCategoriesByLevel(String level);
}
