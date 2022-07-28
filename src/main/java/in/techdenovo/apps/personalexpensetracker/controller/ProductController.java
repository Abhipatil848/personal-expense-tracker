package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Category;
import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.service.CategoryService;
import in.techdenovo.apps.personalexpensetracker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/add")
    public String showCreateProductForm(Model model) {
        List<Category> categories=categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product";
    }

    @PostMapping("/add")
    public String createProduct(@ModelAttribute("product") Product product) {
        productService.createProduct(product);
        return "dashboard";
//        System.out.println(product.getProductName() + " " + product.getProductDescription());
    }
    @GetMapping("/")
    public String showAllProducts(Model model){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("ProductList",productList);
        return "list-products";

    }
    @GetMapping("/spuf/{id}")
    public String showUpdateProductForm(@PathVariable Long id, Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories",categories);
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "update-product";
    }

    @PostMapping("/spuf")
    public String updateProduct(@ModelAttribute("product") Product product){
        Product exitingProduct=productService.getProductById(product.getId());
        exitingProduct.setProductName(product.getProductName());
        exitingProduct.setProductDescription(product.getProductDescription());
        exitingProduct.setCategory(product.getCategory());
        productService.updateProduct(exitingProduct);
        return "dashboard";
    }
}
