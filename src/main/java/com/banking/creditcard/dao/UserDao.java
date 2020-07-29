package com.banking.creditcard.dao;

import com.banking.creditcard.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Long> {

        User findByPanNumber(String panNumber);
}
