package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DetailPembelian extends Model{
    private ResultSet detailpembelian;
    private Integer i=1;

    public DetailPembelian() throws SQLException{
         detailpembelian=setquery("SELECT * FROM `tbl_detail_pembelian`");
    }
    public ResultSet getdpembelian(){
        return detailpembelian;
    }
    public void tambah(HashMap a) throws SQLException{
        String invoice=(String) a.get("invoice_pembelian");
        String kode =(String) a.get("kode_barang");
        String jumlah= (String) a.get("jumlah");
        String value=i.toString()+","+invoice+","+kode+","+ jumlah;
        
        i=i+1;
    }
}
