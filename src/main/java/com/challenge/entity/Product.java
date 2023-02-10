package com.challenge.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "idCategory")
    private Category category;
}
