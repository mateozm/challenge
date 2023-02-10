package com.challenge.controller;

import com.challenge.entity.Keyword;
import com.challenge.entity.Product;
import com.challenge.service.BusinessService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/prueba")
public class ChallengeController {

    private BusinessService businessService;

    public ChallengeController(BusinessService businessService){
        this.businessService = businessService;
    }

    /*Just to test if code compile*/
    @RequestMapping(value ="/findKeywordByCategoryName/{name}", method = RequestMethod.GET)
    public List<Keyword> findAll(@PathVariable String  name){

        return businessService.findByCategoryName(name);
    }

    @RequestMapping(value ="/findLevelCategory/{name}", method = RequestMethod.GET)
    public Integer findLevelCategory(@PathVariable String  name){

        return businessService.findLevelCategory(name);
    }
}
