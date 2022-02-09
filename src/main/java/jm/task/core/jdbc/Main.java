package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
//    private UserService userService;
//
//    public Main (UserService userService) {
//        this.userService = userService;
//    }

    public static void main(String[] args) {

        System.out.println();
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl(new UserDaoJDBCImpl());
        //UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        User user1 = new User("Valery", "Kuleshov", (byte) 28);
        User user2 = new User("Anton", "Antonov", (byte) 56);
        User user3 = new User("Kirill", "Kirillov", (byte) 32);
        User user4 = new User("Ivan", "Ivanov", (byte) 21);


        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("user с именем - " + user1.getName() + " добавлен в базу данных");

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("user с именем - " + user2.getName() + " добавлен в базу данных");

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("user с именем - " + user3.getName() + " добавлен в базу данных");

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("user с именем - " + user4.getName() + " добавлен в базу данных");


        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

