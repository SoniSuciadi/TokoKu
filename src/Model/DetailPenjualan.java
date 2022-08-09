package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DetailPenjualan extends Model{
    private ResultSet detailpenjualan;
    private Integer i=1;
    
    public DetailPenjualan() throws SQLException{
        detailpenjualan=setquery("SELECT * FROM `tbl_detail_penjualan`");
    }
    public ResultSet getdpenjualan(){
        return detailpenjualan;
    }
    public void tambah(HashMap a) throws SQLException{
        String invoice=(String) a.get("invoice_pembelian");
        String kode =(String) a.get("kode_barang");
        String jumlah= (String) a.get("jumlah");
        String value=i.toString()+","+invoice+","+kode+","+ jumlah;
        setquery("INSERT INTO tbl_detail_pembelian VALUE("+value+")");
        i=i+1;
    }
}
