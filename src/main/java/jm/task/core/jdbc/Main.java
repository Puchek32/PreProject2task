package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Alex", "Lyakun", (byte) 12);
        userDaoJDBC.saveUser("Matvei", "Krasnikov", (byte) 10);
        userDaoJDBC.saveUser("Dmitriy", "Gaifulin", (byte) 9);
        userDaoJDBC.saveUser("Varvara", "Videnko", (byte) 8);
        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
