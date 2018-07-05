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

        while (true) {

            System.out.println("Tervetuloa kirjaamaan tuntisi, valitse alla olevista vaihtoehdoista. ");
            System.out.println();
            System.out.println("1. Rekisteröi käyttäjä");
            System.out.println("2. Kirjaa tunnit");
            System.out.println("3. Raportti");

            int syote = Integer.parseInt(lukija.nextLine());

            //TODO tee switch case tästä
            if (syote == 1) {
                teeUusiKayttaja(lukija);
            }


            break;
        }


    }

    private void teeUusiKayttaja(Scanner lukija) {

        System.out.println("Seuravaaksi luodaan uusi käyttäjä. Seuraa ohjeita ja kirjoita vaadittavat tiedot. Pakolliset kentät on merkitty * merkillä.\n");
        System.out.print("Etunimi*: ");
        String etunimi = lukija.nextLine();

        System.out.print("Sukunimi*: ");
        String sukunimi = lukija.nextLine();

        System.out.println("Osasto: ");
        String osasto = lukija.nextLine();

        System.out.println("Tehtavanimike: ");
        String tehtavanimike = lukija.nextLine();

        Kayttaja kayttaja = new Kayttaja(etunimi, sukunimi, osasto, tehtavanimike);

        /*


         */
    }
}
