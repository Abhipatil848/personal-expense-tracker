package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.model.Transaction;
import in.techdenovo.apps.personalexpensetracker.service.ProductService;
import in.techdenovo.apps.personalexpensetracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "transaction")
public class TransactionController {
    @Autowired
    ProductService productService;
    @Autowired
    TransactionService transactionService;

    @GetMapping("/add")
    public String showExpenseAddForm(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products" ,products);
        Transaction transaction = new Transaction();
        model.addAttribute("transaction", transaction);
        return "add-transaction";
    }
    @PostMapping("/add")
    public String createTransaction(@ModelAttribute ("transaction") Transaction transaction){
        transactionService.createTransaction(transaction);
        return "dashboard";

    }
}
