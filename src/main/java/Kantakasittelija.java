import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kantakasittelija {
    private Connection con;

    public void yhteydenLuonti() {


        try {
            Connection con = getConnection();
            System.out.println("Yhteys luotu");
            this.con=con;

        } catch (SQLException e) {
            System.out.println("Kiinni");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/tuntiseuranta?useSSL=false&serverTimezone=UTC", "root", "salasana");
    }

    public Connection getCon() {
        return con;
    }

}
