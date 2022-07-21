package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String showDashboard(Model model){
        Long productsCount=productService.getProductsCount();
        model.addAttribute("ProductsCount",productsCount);
        return "dashboard";
    }
}
