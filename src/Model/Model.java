package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Model {

    private Connection connection;
    private ResultSet resultset;
    private Statement statement;

    public Model(String a) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://Localhost:3306/db_tokoku", "root", "");
            Statement statement= connection.createStatement();
            resultset = statement.executeQuery(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet gettabel() {
        return resultset;
    }

    public void setresultset(String a) throws SQLException {
        resultset = statement.executeQuery(a);
    }
    public String kalender(){
        String tanggal;
        Calendar kalender=new GregorianCalendar();
          
        Integer year=kalender.get(Calendar.YEAR);    
        Integer month=kalender.get(Calendar.MONTH); 
        Integer day=kalender.get(Calendar.DAY_OF_MONTH); 
        String hari=day.toString();
        String bulan=month.toString();
        String tahun=year.toString();
        tanggal= hari+" / "+ bulan+" / "+ tahun;
        
        return tanggal;
    }
}
