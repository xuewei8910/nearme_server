package com.xuewei8910.nearme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wei on 2014/10/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public List<User> findById(long id);
    public List<User> findByUsername(String username);
    public List<User> findByLast_name(String last_name);
    public List<User> findByFirst_name(String first_name);
}
