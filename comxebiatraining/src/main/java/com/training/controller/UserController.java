package com.training.controller;

import com.training.model.User;
import com.training.model.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kchoudhary on 30-Sep-16.
 */

@RestController
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping("/create")
    public String create(String name, String email, String password) {
        User user;
        try {
            user = new User(name, email, password);
            userDao.save(user);
        } catch (Exception e) {
            return "Error creating the user: " + e.toString();
        }
        return "User successfully created! (id = " + user.getId() + ")";
    }

    @RequestMapping("/delete")
    public String delete(long id) {
        try {
            User user = new User(id);
            userDao.delete(user);
        } catch (Exception e) {
            return "Error deleting the user: " + e.toString();
        }
        return "User successfully deleted!";
    }

    @RequestMapping("/get-by-email")
    public String getByEmail(String email) {
        String userId;
        String userName;
        try {
            User user = userDao.findByEmail(email);
            userId = String.valueOf(user.getId());
            userName = user.getName();
        } catch (Exception ex) {
            return "User not found";
        }
        return "The user id is: " + userId+" and User name is "+userName;
    }

    @RequestMapping("/update")
    public String updateUser(long id, String email, String name, String password) {
        try {
            User user = userDao.findOne(id);
            user.setEmail(email);
            user.setName(name);
            user.setPassword(password);
            userDao.save(user);
        } catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User successfully updated!";
    }


}
