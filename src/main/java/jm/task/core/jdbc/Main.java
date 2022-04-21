package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Roman","Longer",(byte) 25);
        userService.saveUser("Podzalupny","Cottagecheese",(byte) 30);
        userService.saveUser("Cheap","Whore",(byte) 55);
        userService.saveUser("Darima", "Soplezhuyka",(byte) 14);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
