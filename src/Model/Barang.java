package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Barang extends Model{

    private ResultSet barang;
    public Barang() throws SQLException {
        barang=setquery("SELECT * FROM `tbl_barang`");

    }
    public ResultSet getbarang(){
        return barang;
    }

    public void barangtambah(HashMap a) throws SQLException {
        String value = a.get("kode_barang") + "," + a.get("nama_barang") + "," + a.get("harga") + "," + a.get("stok");
        setquery("INSERT INTO tbl_Barang VALUE (" + value + ")");
    }

    public void barangedit(HashMap a) throws SQLException {
        String kode = (String) a.get("kode_barang");
        String nama = (String) a.get("nama_barang");
        String harga = (String) a.get("harga");
        String stok = (String) a.get("stok");
        setquery("UPDATE tb_Barang SET nama_barang=" + nama + ", harga=" + harga + ", stok=" + stok + "WHERE kd_barang= " + kode);
    }

    public void baranghapus(String a) throws SQLException {
        setquery("DELETE FROM tbl_Barang WHERE kode_barang= " + a);
    }

}
