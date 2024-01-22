package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {


        userService.createUsersTable();

        userService.saveUser("Anna", "Tebenkova", (byte) 33);
        userService.saveUser("Lilly", "Tebenkova", (byte) 4);
        userService.saveUser("Margarida", "Dos Maritz", (byte) 35);
        userService.saveUser("Adriano", "Santos", (byte) 40);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
