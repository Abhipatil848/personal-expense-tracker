package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/add")
    public String showCreateProductForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product";
    }

    @PostMapping("/add")
    public Product createProduct(@ModelAttribute("product") Product product) {
//        return productService.createProduct(product);
        System.out.println(product.getProductName() + " " + product.getProductDescription());
        return null;
    }
}
