package org.wecancodeit.librarydemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.librarydemo.models.Category;
import org.wecancodeit.librarydemo.repositories.CategoryRepository;

import javax.annotation.Resource;

@Controller
public class CategoryController {

    @Resource
    private CategoryRepository categoryRepo;

    @RequestMapping({"/categories", "/" , ""})
    public String displayCampuses(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        return "categoriesView";
    }

    @GetMapping("/category/{location}")
    public String displaySingleCampus(@PathVariable String location, Model model){
        Category retrievedCategory = categoryRepo.findCategoryByLocation(location);
        model.addAttribute("category", retrievedCategory);
        return "categoryView";
    }
}
