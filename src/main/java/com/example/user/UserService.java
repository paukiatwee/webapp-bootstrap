package com.example.user;


import java.util.List;

public interface UserService {

    void  add(Admin admin);
    Admin update(Admin admin);
    void delete(long id);
    List<Admin> getAllAdmins();
    Admin read(long id);

}
