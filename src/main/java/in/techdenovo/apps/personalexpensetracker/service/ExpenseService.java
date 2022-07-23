package in.techdenovo.apps.personalexpensetracker.service;

import in.techdenovo.apps.personalexpensetracker.model.Expense;
import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;

    public List<Expense> getAllExpense(){return expenseRepository.findAll();}
    public Expense createExpense(Expense expense) {return expenseRepository.save(expense);}
    public Expense getExpenseById(long id) {return expenseRepository.findById(id).orElse(null);}
}
