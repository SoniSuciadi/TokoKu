package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class User extends Model{
    private ResultSet user;
    public User() throws SQLException {
        user=setquery("SELECT * FROM `tbl_pegawai`");
    }
    public ResultSet getuser(){
        return user;
    }
    public void usertambah(HashMap a){
        String value = a.get("id_pegawai") + "," + a.get("nama_pegawai") + "," + a.get("alamat_pegawai") 
                + "," + a.get("username")+ "," +a.get("password")+ "," +a.get("bagian");
        setquery("INSERT INTO tbl_Barang VALUE (" + value + ")");
    }
    public void useredit(HashMap a) throws SQLException {
        String id = (String) a.get("id_pegawai");
        String nama = (String) a.get("nama_pegawai");
        String alamat = (String) a.get("alamat_pegawai");
        String username = (String) a.get("username");
        String password = (String) a.get("password");
        String bagian = (String) a.get("bagian");
        setquery("UPDATE tb_Barang SET nama_pegawai=" + nama + ", alamat_pegawai=" + alamat + 
                ", username=" + username +", password=" + password +", bagian=" + bagian + "WHERE id_pegawai= " + id);
    }
    public void userhapus(String a){
        setquery("DELETE FROM tbl_Barang WHERE id_pegawai= " + a);
    }
}
