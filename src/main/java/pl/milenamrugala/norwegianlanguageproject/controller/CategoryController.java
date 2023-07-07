package pl.milenamrugala.norwegianlanguageproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milenamrugala.norwegianlanguageproject.model.Category;
import pl.milenamrugala.norwegianlanguageproject.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping(value = "/norwegian-language")

public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        super();
        this.categoryService = categoryService;
    }

    @GetMapping("/a1categories")
    public String listA1Categories(Model model) {
        List<Category> A1Categories = categoryService.getCategoriesByLevel("A1");
        model.addAttribute("categories", A1Categories);
        return "a1categories";
    }

    @GetMapping("/a2categories")
    public String listA2Categories(Model model) {
        List<Category> A2Categories = categoryService.getCategoriesByLevel("A2");
        model.addAttribute("categories", A2Categories);
        return "a2categories";
    }

    @GetMapping("/b1categories")
    public String listB1Categories(Model model) {
        List<Category> B1Categories = categoryService.getCategoriesByLevel("B1");
        model.addAttribute("categories", B1Categories);
        return "b1categories";
    }

    @GetMapping("/b2categories")
    public String listB2Categories(Model model) {
        List<Category> B2Categories = categoryService.getCategoriesByLevel("B2");
        model.addAttribute("categories", B2Categories);
        return "b2categories";
    }

    @GetMapping("/c1categories")
    public String listC1Categories(Model model) {
        List<Category> C1Categories = categoryService.getCategoriesByLevel("C1");
        model.addAttribute("categories", C1Categories);
        return "c1categories";
    }
}
