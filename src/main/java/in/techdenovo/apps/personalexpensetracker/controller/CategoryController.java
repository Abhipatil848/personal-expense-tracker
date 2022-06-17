package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Category;
import in.techdenovo.apps.personalexpensetracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value ="/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @GetMapping("/add")
    public String showCreateCategoryForm(Model model){
        Category category = new Category();
        model.addAttribute("category",category);
        return "add-category";
    }

    @PostMapping("/add")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
}
