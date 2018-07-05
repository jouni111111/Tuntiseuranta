import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Kayttoliittyma {

    public void start(Connection con) throws SQLException {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Tuntari - Tuntikirjausten Uber");
        System.out.println("===============================");
        System.out.println();
        System.out.println();

        while(true){

            System.out.println("Tervetuloa kirjaamaan tuntisi, valitse alla olevista vaihtoehdoista. ");
            System.out.println();
            System.out.println("1. Rekisteröi käyttäjä");
            System.out.println("2. Kirjaa tunnit");
            System.out.println("3. Raportti");

            break;
        }



    }
}
