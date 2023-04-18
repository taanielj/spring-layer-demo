package com.example.springlayerdemo.persistence;

import com.example.springlayerdemo.businesslayer.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
}
