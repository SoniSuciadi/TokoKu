/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.Model;
import Model.User;
import View.Adm.FAdm;
import View.Flogin;
import View.Gudang.Fgudang;
import View.Kasir.Fkasir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author sonys
 */
public class c1 {
    private String jabatan, nama;
    Flogin fl=new Flogin();
    User user=new User();
    public c1() throws SQLException{
        
        fl.blogievent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    while(user.getuser().next()){
                        String usernamedb=user.getuser().getString(4);
                        String passworddb= user.getuser().getString(5);
                        String username= fl.getusername().getText();
                        String password=fl.getpassword().getText();
                        if (username.equals(usernamedb)&&password.equals(passworddb)){
                            jabatan=user.getuser().getString(6);
                            nama=user.getuser().getString(2);
                            break;
                        }
                        else{
                            jabatan="kosong";
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(jabatan.equals("kosong")){
                    JOptionPane.showMessageDialog( fl, "Username dan Password salah ");
                    fl.getusername().setText("");
                    fl.getpassword().setText("");
                }
                else if(jabatan.equals("Kasir")){
                    Fkasir fkasir=new Fkasir();
                    fkasir.setnama(nama);
                    fkasir.blogoutevt(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            fkasir.setVisible(false);
                            fl.setVisible(true);
                            JOptionPane.showMessageDialog( fkasir, "Anda Telah Keluar");
                            isemptylogin();
                        }
                    });
                }
                else if(jabatan.equals("Gudang")){
                    Fgudang fgudang=new Fgudang();
                    fgudang.setnama(nama);
                    fgudang.blogoutevt(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            fgudang.setVisible(false);
                            fl.setVisible(true);
                            JOptionPane.showMessageDialog( fgudang, "Anda Telah Keluar");
                            isemptylogin();
                        }
                    });
                }
                else if(jabatan.equals("ADM")){
                    FAdm fadm=new FAdm();
                    fadm.setnama(nama);
                    fadm.blogoutevt(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            fadm.setVisible(false);
                            fl.setVisible(true);
                            JOptionPane.showMessageDialog( fadm, "Anda Telah Keluar");
                            isemptylogin();
                        }
                    });
                }
            }
            
        });
        
    
        
    }
    public void isemptylogin(){
        fl.getusername().setText("");
        fl.getpassword().setText("");
        jabatan="kosong";
    }
    
}
