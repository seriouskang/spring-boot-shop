package spring.study.shop.domain.entity.item;

import spring.study.shop.domain.entity.Category;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;
    private String name;
    private Long price;
    private int stockQuantity;
    @ManyToMany(mappedBy = "items")
    private List<Category> categories;
}
