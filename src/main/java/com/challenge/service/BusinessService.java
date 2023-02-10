package com.challenge.service;

import com.challenge.entity.Keyword;
import com.challenge.entity.Product;

import java.util.List;

public interface BusinessService {

    List<Keyword> findByCategoryName(String name);

    Integer findLevelCategory(String name);
}
