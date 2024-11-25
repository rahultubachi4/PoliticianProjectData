package com.politician.repository;

import com.politician.entity.Politician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticianRepository extends JpaRepository<Politician, Integer> {

}
