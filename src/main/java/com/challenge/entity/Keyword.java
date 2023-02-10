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
public class Keyword {

    @Id
    @Column(name = "idKeyword")
    private Long idKeyword;

    @Column(name = "keyword")
    private String keyword;

    @Column(name = "idCategory", insertable = false, updatable = false)
    private Long idCategory;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "idCategory")
    private Category category;
}
