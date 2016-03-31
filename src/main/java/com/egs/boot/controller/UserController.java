package com.egs.boot.controller;

import com.egs.boot.dao.CategoryDao;
import com.egs.boot.dao.UserDao;
import com.egs.boot.dto.CategoryDto;
import com.egs.boot.dto.UserDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by zorikz on 03/30/2016.
 */

@Transactional(rollbackOn = {Throwable.class})
@Component
public class UserController {

    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    UserDao userDao;

    @Autowired
    CategoryDao categoryDao;

    public void save() throws Exception {
        userDao.saveUser(getUser());
        testTransaction();
        categoryDao.saveCategory(getCategory());
    }

    public CategoryDto getCategory() {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("category");
        return categoryDto;
    }

    public UserDto getUser() {
        UserDto userDto = new UserDto();
        userDto.setName("name");
        userDto.setSurname("surname");
        return userDto;
    }

    public void testTransaction() throws Exception {
        throw new Exception();
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
