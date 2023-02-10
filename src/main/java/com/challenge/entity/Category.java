package com.challenge.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


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

}
