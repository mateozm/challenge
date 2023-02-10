package com.challenge.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@ToString
@Entity
public class Category implements Serializable {

    @Id
    @Column(name = "idCategory")
    private Long idCategory;

    @Column(name = "name")
    private String name;

    @Column(name = "idSubcategory")
    private Long idSubCategory;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> product;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Keyword> keyword;

}
