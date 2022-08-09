package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Pembelian extends Model{
    private ResultSet pembelian;

    public Pembelian() throws SQLException{
        pembelian=setquery("SELECT * FROM `tbl_detail_pembelian`");
    }
    public ResultSet getpembelian (){
        return pembelian;
    }
    public void tambah(HashMap a) throws SQLException {
        String value = a.get("invoice_pembelian") + "," + a.get("id_suplier") + "," + a.get("id_pegawai")+kalender() ;
        setquery("INSERT INTO tbl_pembelian VALUE (" + value + ")");
    }
    
}
