package com.example.user;


import java.util.List;

/**
 * @author Pau Kiat Wee (mailto:paukiatwee@gmail.com)
 *
 */
public interface UserService {

    void  add(User admin);
    User update(User admin);
    void delete(long id);
    List<User> getAllAdmins();
    User read(long id);

}
