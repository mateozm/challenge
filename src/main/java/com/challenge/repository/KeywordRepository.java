package com.challenge.repository;


import com.challenge.entity.Category;
import com.challenge.entity.Keyword;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
    List<Keyword> findByCategoryName(String name);

    List<Keyword> findByIdCategory(Long idCategory);
}
