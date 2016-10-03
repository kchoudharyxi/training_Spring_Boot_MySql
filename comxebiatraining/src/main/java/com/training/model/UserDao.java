package com.training.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by kchoudhary on 30-Sep-16.
 */
@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);

}
