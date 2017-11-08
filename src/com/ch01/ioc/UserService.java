package com.ch01.ioc;

public class UserService {
    private UserDAO userDAO;

    public void add() {
        System.out.println("Service");
        userDAO.add();
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
