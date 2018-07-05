
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Kantakasittelija kantakasittelija = new Kantakasittelija();
        kantakasittelija.yhteydenLuonti();
        Connection con = kantakasittelija.getCon();

        Kayttoliittyma kayttis = new Kayttoliittyma();
        kayttis.start(con);

    }
}
