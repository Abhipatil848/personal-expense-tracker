package in.techdenovo.apps.personalexpensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "CATEGORY_NAME")
    private  String categoryName;
    @Column(name = "CATEGORY_DESCRIPTION")
    private String categoryDescription;
}
