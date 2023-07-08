package pl.milenamrugala.norwegianlanguageproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milenamrugala.norwegianlanguageproject.model.Category;
import pl.milenamrugala.norwegianlanguageproject.model.Vocabulary;
import pl.milenamrugala.norwegianlanguageproject.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping(value = "/norwegian-language")

public class VocabularyController {

    private CategoryService categoryService;

    public VocabularyController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/vocabulary/{categoryId}")
    public String showVocabularyByCategory(@PathVariable Long categoryId, Model model) {
        Category category = categoryService.getCategoryById(categoryId);
        List<Vocabulary> vocabularies = category.getVocabularies();
        model.addAttribute("vocabularies", vocabularies);
        model.addAttribute("categoryName", category.getName());
        return "vocabulary";
    }


}
