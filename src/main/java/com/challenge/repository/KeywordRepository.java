package com.challenge.repository;


import com.challenge.entity.Keyword;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
}
