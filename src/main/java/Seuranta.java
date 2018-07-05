import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class Seuranta {
    private int id;
    private Date pvm;
    private float tunnit;
    private String tehtavankuvaus;
    private boolean laskutettava;
    private int kayttajaID;

    public Seuranta() {
    }

    public Seuranta(Date pvm, float tunnit, int kayttajaID) {
        this.pvm = pvm;
        this.tunnit = tunnit;
        this.kayttajaID = kayttajaID;
    }

    public Seuranta(Date pvm, float tunnit, boolean laskutettava, int kayttajaID) {
        this.pvm = pvm;
        this.tunnit = tunnit;
        this.laskutettava = laskutettava;
        this.kayttajaID = kayttajaID;
    }

    public Seuranta(Date pvm, float tunnit, String tehtavankuvaus, boolean laskutettava, int kayttajaID) {
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
    public void lisaaTauluun(Seuranta kirjaus, Connection con) throws SQLException {
        String sql= "insert into Seuranta(pvm, tunnit, tehtavankuvaus, laskutettava, kayttajaID) values(?,?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, kirjaus.getPvm());
        ps.setFloat(2, kirjaus.getTunnit());
        ps.setString(3, kirjaus.getTehtavankuvaus());
        ps.setBoolean(4, kirjaus.isLaskutettava());
        ps.setInt(5, kirjaus.getKayttajaID());
        ps.executeUpdate();
    }
}
