package in.techdenovo.apps.personalexpensetracker.service;

import in.techdenovo.apps.personalexpensetracker.model.Category;
import in.techdenovo.apps.personalexpensetracker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }
    public Category getCategoryById(long id){
        return categoryRepository.findById(id).orElse(null);
    }

}
