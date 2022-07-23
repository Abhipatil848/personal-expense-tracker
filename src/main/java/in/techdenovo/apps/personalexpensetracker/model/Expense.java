package in.techdenovo.apps.personalexpensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "Expenses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "PRODUCT_NAME")
    private  String productName;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "DATE")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date date;
}
