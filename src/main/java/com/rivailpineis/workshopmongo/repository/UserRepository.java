package com.rivailpineis.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rivailpineis.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
