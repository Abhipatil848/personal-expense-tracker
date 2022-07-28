package in.techdenovo.apps.personalexpensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "Transactions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
//    @Column(name = "PRODUCT_NAME")
    private  Product product;
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "DATE")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
//    @Temporal(TemporalType.DATE)
    private Date date;
}
