package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {
        String driver = "mysql";
        String dataBaseAddress= "localhost";
        String dataBaseName = "digital_inovation_one";
        String user ="root";
        String password ="password";

        StringBuilder sb = new StringBuilder("jdbc:").append(driver).append("://")
                .append(dataBaseAddress).append("/").append(dataBaseName);
        String connectionUrl = sb.toString();

        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        }

    }

    }

