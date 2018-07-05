import java.sql.Connection;
import java.sql.Date;
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
                teeUusiKayttaja(lukija, con);
            } else if (syote == 2){
                lisaaSeuranta(lukija, con);
            } else {
                System.out.println("LOL");
            }


            break;
        }


    }

    private void teeUusiKayttaja(Scanner lukija, Connection con) throws SQLException {

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
        kayttaja.lisaaTauluun(con);

    }

    private void lisaaSeuranta(Scanner lukija, Connection con) throws SQLException {

        System.out.println("Seuravaaksi kirjataan tunnit. Seuraa ohjeita ja kirjoita vaadittavat tiedot. Pakolliset kentät on merkitty * merkillä.\n");
        System.out.print("Päivämäärä(VVVV, KK, PP)*: ");
        String pvmstr = lukija.nextLine();
        Date pvm = new Date(0);
        pvm.valueOf(pvmstr);

        System.out.print("Tunnit*: ");
        float tunnit = Float.parseFloat(lukija.nextLine());

        System.out.println("Tehtävänkuvaus: ");
        String kuvaus = lukija.nextLine();

        System.out.println("Laskutettava (k/e): ");
        String boolenarvo = lukija.nextLine();
        boolenarvo.toLowerCase();

        System.out.println("KäyttäjäID: ");
        int id = Integer.parseInt(lukija.nextLine());

        if(boolenarvo.equals("k")){
            Seuranta seuranta = new Seuranta(pvm, tunnit, kuvaus, true, id);
            seuranta.lisaaTauluun(seuranta, con);
        } else {
            Seuranta seuranta = new Seuranta(pvm, tunnit, kuvaus, false, id);
            seuranta.lisaaTauluun(seuranta, con);
        }

        /*
private Date pvm;
    private float tunnit;
    private String tehtavankuvaus;
    private boolean laskutettava;
    private int kayttajaID;

         */
    }
}
