package com.roy.football.match.jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.roy.football.match.jpa.entities.calculation.EAsiaPk;

@Repository
public interface AsiaPkRepository extends CrudRepository<EAsiaPk, Long>{

}
