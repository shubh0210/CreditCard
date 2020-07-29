package com.banking.creditcard.service;

import com.banking.creditcard.dao.UserDao;
import com.banking.creditcard.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{



    @Autowired
    UserDao userDao;


    @Override
    public String getEligibility(String panNumber) {
        User user = userDao.findByPanNumber(panNumber);
        if(user!=null) {
            double creditScore = user.getCreditScore();
            if (creditScore >= 5) {
                return "eligible";
            } else {
                return "notEligible";
            }
        }
        else {
            return "invalid";
        }
    }
}
