package cn.edu.ecust.modeldisplay.service;

import cn.edu.ecust.modeldisplay.model.User;

import java.util.List;

public interface UserService {
    List<User> index(User currentUser);
    void register(User user);
    User getUserByEmail(String email);
    User getUserByUserID(String id);
    void deleteUser(User currentUser, String id);
    void changePassword(String userID,String oldPassword,String newPassword);
}