package com.challenge.entity;


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

    @ManyToOne
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory", insertable = false, updatable = false)
    private Category category;

    @Column(name = "keyword")
    private String keyword;
}
