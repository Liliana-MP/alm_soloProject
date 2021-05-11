package com.example.springdocker.repository;

import com.example.springdocker.model.Shoe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoeRepository extends MongoRepository<Shoe, String> {

    List<Shoe> findShoesByCanIWearIt(boolean canWear);
}
