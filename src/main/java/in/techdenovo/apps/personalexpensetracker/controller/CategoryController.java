package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Category;
import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value ="/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/add")
    public String showCreateCategoryForm(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "add-category";
    }

    @PostMapping("/add")
    public String createCategory(@ModelAttribute("category") Category category) {
        categoryService.createCategory(category);
        return "dashboard";
    }

    @GetMapping("/")
    public String showAllProducts(Model model) {
        List<Category> categoryList = categoryService.getAllCategories();
        model.addAttribute("CategoryList", categoryList);
        return "list-category";
    }
}
