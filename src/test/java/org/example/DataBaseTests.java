package org.example;

import org.junit.Test;

import java.sql.*;


public class DataBaseTests{
    @Test
    public void checkExoticFruit() throws SQLException{
        Connection connection
                = DriverManager.getConnection
                ("jdbc:h2:tcp://localhost:9092/mem:testdb", "user", "pass");

        String insert =
                "INSERT INTO FOOD (FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC) VALUES (5, 'TEST', 'FRUIT', 1);";
        String query =
                "Select * From FOOD;";
        String delete =
                "DELETE FROM FOOD WHERE FOOD_ID = 5;";

        Statement statement = connection.createStatement();

        statement.executeUpdate(insert);
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        System.out.println("\n" + "Удаление нового товара:" + "\n");
        statement.executeUpdate(delete);
        resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        connection.close();
    }

    @Test
    public void checkNonExoticFruit() throws SQLException {
        Connection connection
                = DriverManager.getConnection
                ("jdbc:h2:tcp://localhost:9092/mem:testdb", "user", "pass");
        String insert =
                "INSERT INTO FOOD (FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC) VALUES (5, 'TEST2', 'FRUIT', 0);";
        String query =
                "Select * From FOOD;";
        String delete =
                "DELETE FROM FOOD WHERE FOOD_ID = 5;";

        Statement statement = connection.createStatement();

        statement.executeUpdate(insert);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        System.out.println("\n" + "Удаление нового товара:" + "\n");
        statement.executeUpdate(delete);
        resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        connection.close();
    }

    @Test
    public void checkNonExoticVegetable() throws SQLException {
        Connection connection
                = DriverManager.getConnection
                ("jdbc:h2:tcp://localhost:9092/mem:testdb", "user", "pass");
        String insert =
                "INSERT INTO FOOD (FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC) VALUES (5, 'TEST3', 'VEGETABLE', 0);";
        String query =
                "Select * From FOOD;";
        String delete =
                "DELETE FROM FOOD WHERE FOOD_ID = 5;";

        Statement statement = connection.createStatement();

        statement.executeUpdate(insert);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        System.out.println("\n" + "Удаление нового товара:" + "\n");
        statement.executeUpdate(delete);
        resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        connection.close();
    }

    @Test
    public void checkExoticVegetable() throws SQLException {
        Connection connection
                = DriverManager.getConnection
                ("jdbc:h2:tcp://localhost:9092/mem:testdb", "user", "pass");
        String insert =
                "INSERT INTO FOOD (FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC) VALUES (5, 'TEST4', 'VEGETABLE', 1);";
        String query =
                "Select * From FOOD;";
        String delete =
                "DELETE FROM FOOD WHERE FOOD_ID = 5;";

        Statement statement = connection.createStatement();

        statement.executeUpdate(insert);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        System.out.println("\n" + "Удаление нового товара:" + "\n");
        statement.executeUpdate(delete);
        resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            int FOOD_ID = resultSet.getInt("FOOD_ID");
            String FOOD_NAME = resultSet.getString("FOOD_NAME");
            String FOOD_TYPE = resultSet.getString("FOOD_TYPE");
            int FOOD_EXOTIC = resultSet.getInt("FOOD_EXOTIC");
            System.out.printf("%d, %s, %s, %d%n", FOOD_ID, FOOD_NAME, FOOD_TYPE, FOOD_EXOTIC);
        }

        connection.close();
    }
}
