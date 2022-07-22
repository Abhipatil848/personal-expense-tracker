package in.techdenovo.apps.personalexpensetracker.controller;

import in.techdenovo.apps.personalexpensetracker.model.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "expense")
public class ExpenseController {

    @GetMapping("/add")
    public String showExpenseAddForm(Model model){
        Expense expense = new Expense();
        model.addAttribute("expense",expense);
        return "add-expense";
    }
}
