package spring.study.shop.domain.entity;

import spring.study.shop.domain.entity.item.Item;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private Long orderPrice;
    private int count;
}
