package in.techdenovo.apps.personalexpensetracker.service;

import in.techdenovo.apps.personalexpensetracker.model.Transaction;
import in.techdenovo.apps.personalexpensetracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getAllTransaction(){return transactionRepository.findAll();}
    public Transaction createTransaction(Transaction transaction) {return transactionRepository.save(transaction);}
    public Transaction getTransactionById(long id) {return transactionRepository.findById(id).orElse(null);}

    public Double currentDayExpense(){
        Double todayExpense =0.0;
        List<Transaction> transactions = transactionRepository.findAll();
        for (Transaction transaction:
             transactions) {
            todayExpense = todayExpense + transaction.getAmount();
        }
        return todayExpense;
    }
}
