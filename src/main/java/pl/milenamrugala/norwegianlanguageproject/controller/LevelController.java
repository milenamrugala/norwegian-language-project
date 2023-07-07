package pl.milenamrugala.norwegianlanguageproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.milenamrugala.norwegianlanguageproject.service.LevelService;

@Controller
@RequestMapping(value = "/norwegian-language")

public class LevelController {

 private LevelService levelService;

    @Autowired
    public LevelController(LevelService levelService) {
        super();
        this.levelService = levelService;
    }

    @GetMapping("/levels")
    public String listLevels(Model model) {
        model.addAttribute("levels", levelService.getAllLevels());
        return "levels";
    }


}
