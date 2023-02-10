package com.challenge.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
public class Product {

    @Id
    @Column(name = "idProduct")
    private Long idProduct;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "idCategory")
    private Category category;
}
