package com.egs.boot.dao;

import com.egs.boot.dto.UserDto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by zorikz on 03/30/2016.
 */

@Repository
public class UserDao {
    @Autowired
    SessionFactory sessionFactory;

    public void saveUser(UserDto userDto) {
        sessionFactory.getCurrentSession().persist(userDto);
    }

}
