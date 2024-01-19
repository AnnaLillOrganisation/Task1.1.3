package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // реализуйте настройку соеденения с БД
    private static String dbURL = "jdbc:postgresql://localhost:5432/postgres";//создаем стрингу, где прописываем урл
    private static String dbUsername = "postgres";
    private static String dbPassword = "12345";

    public static Connection getConnection() { //соединяем с бд
        Connection connection = null; // создаем переменную, с которой будем работать
        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword); //создаем коннекшн, обращаясь к драйверменеджеру ,
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // используя метод гетконнекшн, в который передаем параметры , что соединение пройдет с таким урл, нэймом и пасвордом
        //когда гетконекшн подсветился, оборачиваем в трай кеч

        return connection;
    }
}
