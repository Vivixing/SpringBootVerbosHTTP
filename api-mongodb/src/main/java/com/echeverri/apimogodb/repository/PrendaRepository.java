package com.echeverri.apimogodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.echeverri.apimogodb.model.Prenda;

@Repository
public interface PrendaRepository extends MongoRepository<Prenda, String> {

}
