import java.util.Date;

public class Seuranta {
    private int id;
    private Date pvm;
    private float tunnit;
    private String tehtavankuvaus;
    private boolean laskutettava;
    private int kayttajaID;

    public Seuranta() {
    }

    public Seuranta(int id, Date pvm, float tunnit, int kayttajaID) {
        this.id = id;
        this.pvm = pvm;
        this.tunnit = tunnit;
        this.kayttajaID = kayttajaID;
    }

    public Seuranta(int id, Date pvm, float tunnit, boolean laskutettava, int kayttajaID) {
        this.id = id;
        this.pvm = pvm;
        this.tunnit = tunnit;
        this.laskutettava = laskutettava;
        this.kayttajaID = kayttajaID;
    }

    public Seuranta(int id, Date pvm, float tunnit, String tehtavankuvaus, boolean laskutettava, int kayttajaID) {
        this.id = id;
        this.pvm = pvm;
        this.tunnit = tunnit;
        this.tehtavankuvaus = tehtavankuvaus;
        this.laskutettava = laskutettava;
        this.kayttajaID = kayttajaID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPvm() {
        return pvm;
    }

    public void setPvm(Date pvm) {
        this.pvm = pvm;
    }

    public float getTunnit() {
        return tunnit;
    }

    public void setTunnit(float tunnit) {
        this.tunnit = tunnit;
    }

    public String getTehtavankuvaus() {
        return tehtavankuvaus;
    }

    public void setTehtavankuvaus(String tehtavankuvaus) {
        this.tehtavankuvaus = tehtavankuvaus;
    }

    public boolean isLaskutettava() {
        return laskutettava;
    }

    public void setLaskutettava(boolean laskutettava) {
        this.laskutettava = laskutettava;
    }

    public int getKayttajaID() {
        return kayttajaID;
    }

    public void setKayttajaID(int kayttajaID) {
        this.kayttajaID = kayttajaID;
    }

    @Override
    public String toString() {
        return "Seuranta{" +
                "id=" + id +
                ", pvm=" + pvm +
                ", tunnit=" + tunnit +
                ", kayttajaID=" + kayttajaID +
                '}';
    }
}
