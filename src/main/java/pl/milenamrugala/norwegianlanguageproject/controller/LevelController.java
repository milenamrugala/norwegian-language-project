package pl.milenamrugala.norwegianlanguageproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LevelController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "in progress...";
    }
}
