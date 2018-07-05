public class Main {
    public static void main(String[] args) {
        Kantakasittelija kantakasittelija = new Kantakasittelija();

        Kayttoliittyma kayttis = new Kayttoliittyma();
        kayttis.start(kantakasittelija.getCon());

    }
}
