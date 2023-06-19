package spring.study.shop.domain.entity;

import spring.study.shop.domain.entity.item.Item;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "order_id")
    private Order order;
    private Long orderPrice;
    private int count;
}
