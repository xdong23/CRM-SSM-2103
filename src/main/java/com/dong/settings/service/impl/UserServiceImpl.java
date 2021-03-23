package com.dong.settings.service.impl;


import com.dong.settings.dao.UserDAO;
import com.dong.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author daDong
 * @version 1.0
 * @description
 * @date 2021-03-23-23:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
}
