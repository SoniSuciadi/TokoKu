package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Pelanggan extends Model{
    private ResultSet pelanggan;


    public Pelanggan() throws SQLException{
        pelanggan=setquery("SELECT * FROM `tbl_pelanggan`");
    }
    public ResultSet getpelanggan(){
        return pelanggan;
    }

    public void tambah(HashMap a) throws SQLException {
        String value = a.get("id_pelanggan") + "," + a.get("nama_pelanggan") + "," + a.get("alamat") + "," + a.get("nohp_pelanggan");
        setquery("INSERT INTO tbl_Pelanggan VALUE (" + value + ")");
    }

    public void edit(HashMap a) throws SQLException {
        String id = (String) a.get("id_pelanggan");
        String nama = (String) a.get("nama_pelanggan");
        String alamat = (String) a.get("alamat");
        String nohp = (String) a.get("nohp_pelanggan");
        setquery("UPDATE tb_Pelanggan SET nama_pelanggan=" + nama + ", alamat=" + alamat + ", nohp_pelanggan=" + nohp + "WHERE id_pelanggang= " + id);
    }

    public void hapus(String a) throws SQLException {
        setquery("DELETE FROM tbl_Pelanggan WHERE id_pelanggan= " + a);
    }
}

