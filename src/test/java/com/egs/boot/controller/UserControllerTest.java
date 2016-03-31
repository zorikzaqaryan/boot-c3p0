package com.egs.boot.controller;

import com.egs.boot.BootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by zorikz on 03/31/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootApplication.class)
@WebAppConfiguration
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void save() throws Exception {
        userController.save();
    }
}