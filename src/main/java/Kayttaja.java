public class Kayttaja {
    private int id;
    private String etunimi;
    private String Sukunimi;
    private String osasto;
    private String tehtavanimike;

    public Kayttaja() {
    }

    public Kayttaja(int id, String etunimi, String sukunimi) {
        this.id = id;
        this.etunimi = etunimi;
        Sukunimi = sukunimi;
    }

    public Kayttaja(int id, String etunimi, String sukunimi, String osasto) {
        this.id = id;
        this.etunimi = etunimi;
        Sukunimi = sukunimi;
        this.osasto = osasto;
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
