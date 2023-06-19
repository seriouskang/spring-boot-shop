package spring.study.shop.domain.entity;

import spring.study.shop.domain.DeliveryStatus;
import spring.study.shop.domain.vo.Address;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
    @OneToOne(mappedBy = "delivery")
    private Order order;
    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
