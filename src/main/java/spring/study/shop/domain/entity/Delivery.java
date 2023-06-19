package spring.study.shop.domain.entity;

import lombok.Setter;
import spring.study.shop.domain.DeliveryStatus;
import spring.study.shop.domain.vo.Address;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
    @Setter
    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;
    @Embedded
    private Address address;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
