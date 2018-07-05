import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kayttaja {
    private int id;
    private String etunimi;
    private String Sukunimi;
    private String osasto;
    private String tehtavanimike;

    public Kayttaja() {
    }

    public Kayttaja( String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        Sukunimi = sukunimi;
    }

    public Kayttaja( String etunimi, String sukunimi, String osasto) {
        this.etunimi = etunimi;
        Sukunimi = sukunimi;
        this.osasto = osasto;
    }

    public Kayttaja(String etunimi, String sukunimi, String osasto, String tehtavanimike) {
        this.etunimi = etunimi;
        Sukunimi = sukunimi;
        this.osasto = osasto;
        this.tehtavanimike = tehtavanimike;
    }

    public void lisaaTauluun (Connection con) throws SQLException {

        String query = "insert into kayttaja(etunimi, sukunimi, osasto, tehtavanimike) values(?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);
        String etuNimi = this.getEtunimi();
        String sukuNimi = this.getSukunimi();
        String osasto = this.getOsasto();
        String tehtavaNimike = this.getTehtavanimike();
        stmt.setString(1, etuNimi);
        stmt.setString(2, sukuNimi);
        stmt.setString(3, osasto);
        stmt.setString(4, tehtavaNimike);
        stmt.executeUpdate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return Sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        Sukunimi = sukunimi;
    }

    public String getOsasto() {
        return osasto;
    }

    public void setOsasto(String osasto) {
        this.osasto = osasto;
    }

    public String getTehtavanimike() {
        return tehtavanimike;
    }

    public void setTehtavanimike(String tehtavanimike) {
        this.tehtavanimike = tehtavanimike;
    }

    @Override
    public String toString() {
        return "Kayttaja{" +
                "id=" + id +
                ", etunimi='" + etunimi + '\'' +
                ", Sukunimi='" + Sukunimi + '\'' +
                '}';
    }


}
