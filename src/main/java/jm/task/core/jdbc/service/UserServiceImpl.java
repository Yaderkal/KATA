package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.dao.UserDao;
import jm.task.core.jdbc.service.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl extends Util implements UserService  {
    UserDao userdao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        this.userdao.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        this.userdao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        this.userdao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        this.userdao.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return this.userdao.getAllUsers();
    }

    public void cleanUsersTable() {
        this.userdao.cleanUsersTable();
    }
}
