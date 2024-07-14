package com.danilov.springboot.springboot.DAO;


import com.danilov.springboot.springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUserList();
    void saveUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
}
