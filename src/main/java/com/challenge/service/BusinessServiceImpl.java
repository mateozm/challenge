package com.challenge.service;

import com.challenge.dto.KeywordDTO;
import com.challenge.entity.Category;
import com.challenge.entity.Keyword;
import com.challenge.repository.CategoryRepository;
import com.challenge.repository.KeywordRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService{

    private final KeywordRepository keywordRepository;

    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    public BusinessServiceImpl(KeywordRepository keywordRepository, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.keywordRepository = keywordRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<KeywordDTO> findByCategoryName(String name) {

        List<Keyword> keywords = keywordRepository.findByCategoryName(name);

        while (keywords.isEmpty()) {
            Optional<Category> categoryOptional = categoryRepository.findByName(name);

            Optional<Category> categoryOptional1 = categoryRepository.findByIdCategory(categoryOptional.get().getParentCategory().getIdCategory());

            keywords = keywordRepository.findByIdCategory(categoryOptional1.get().getIdCategory());
        }

        return Arrays.asList(modelMapper.map(keywords, KeywordDTO[].class));
    }

    public Integer findLevelCategory(String name){

        Optional<Category> categoryOptional = categoryRepository.findByName(name);

        int cont = 1;

        while (categoryOptional.get().getParentCategory() != null) {

            categoryOptional = categoryRepository.findByIdCategory(categoryOptional.get().getParentCategory().getIdCategory());

            cont++;
        }

        return cont;

    }
}
