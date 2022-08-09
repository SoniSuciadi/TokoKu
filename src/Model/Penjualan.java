package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Penjualan extends Model{
    private ResultSet penjualan;

    public Penjualan() throws SQLException{
        penjualan=setquery("SELECT * FROM `tbl_detail_penjualan`");
    }
    public ResultSet getpenjualan(){
        return penjualan;
    }
    public void tambah(HashMap a) throws SQLException {
        String value = a.get("invoice_penjualan") + "," + a.get("id_pelanggan") + "," + a.get("id_pegawai")+kalender() ;
        setquery("INSERT INTO tbl_penjualan VALUE (" + value + ")");
    }
}
