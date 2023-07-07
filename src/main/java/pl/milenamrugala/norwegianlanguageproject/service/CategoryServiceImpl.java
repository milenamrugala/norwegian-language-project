package pl.milenamrugala.norwegianlanguageproject.service;

import org.springframework.stereotype.Service;
import pl.milenamrugala.norwegianlanguageproject.model.Category;
import pl.milenamrugala.norwegianlanguageproject.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);

    }

    @Override
    public List<Category> getCategoriesByLevel(String level) {
        return categoryRepository.findByLevel_Name(level);
    }
}
