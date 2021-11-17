package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Alex", "Lyakun", (byte) 12);
        userDaoHibernate.saveUser("Matvei", "Krasnikov", (byte) 10);
        userDaoHibernate.saveUser("Dmitriy", "Gaifulin", (byte) 9);
        userDaoHibernate.saveUser("Varvara", "Videnko", (byte) 8);
        userDaoHibernate.getAllUsers().forEach(System.out::println);
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}
