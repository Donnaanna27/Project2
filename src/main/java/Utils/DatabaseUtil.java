package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {

    private static final String DB_URL = "jdbc:sqlserver://01-128-004;trustServerCertificate=true";
    private static final String DB_USER = "TestAutomation_";
    private static final String DB_PASSWORD = "TestAutomation1234";

    public static void insertUser(UserData user) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO users (first_name, last_name, email, Company, Address1, City,PostCode))";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, user.getFirstName());
                preparedStatement.setString(2, user.getLastName());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getCompany());
                preparedStatement.setString(5, user.getAddress1());
                preparedStatement.setString(6, user.getCity());
                preparedStatement.setString(7, user.getPostCode());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertRegistrationData(UserData registrationData) {
    }
}
