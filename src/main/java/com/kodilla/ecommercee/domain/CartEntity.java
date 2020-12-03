package com.kodilla.ecommercee.domain;


import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "CARTS")
public class CartEntity {


    @Id
    @Column(name = "CART_ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "carts")
    private final List<ProductEntity> products = new ArrayList<>();


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    public UserEntity userEntity;


    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}