/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Gudang;

import View.Kasir.*;
import View.Background;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sonys
 */
public class Fgudang extends Background{
    JLabel lnamagudang;
    JButton bcekbarang,bbarangmsk,bbarangklr,blogout;
    public Fgudang (){
        JLabel background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/BACKGROUND.jpg")));
        background.setBounds(0, 0, 1366, 768);
        
        JPanel porenge=new JPanel();
        porenge.setBackground(new java.awt.Color(255,174,114));
        porenge.setBounds(0, 150, 380, 650);
        
        JPanel pputih=new JPanel();
        pputih.setBackground(Color.WHITE);
        pputih.setBounds(0, 45, 380, 110);
        
        JLabel igudang=new JLabel();
        igudang.setIcon(new ImageIcon(getClass().getResource("/gambar/gudang/gudang.png")));
        igudang.setBounds(10 , 56, 87,87);
        
        JLabel lgudang=new JLabel("G U D A N G");
        lgudang.setFont(new java.awt.Font("Tahoma", 0, 35));
        lgudang.setBounds(120, 50, 250, 40);
        
        lnamagudang=new JLabel("Nama Gudang");
        lnamagudang.setFont(new java.awt.Font("Tahoma", 0, 30));
        lnamagudang.setBounds(120, 90, 250, 40);
        lnamagudang.setForeground(Color.red);
        
        bcekbarang=new JButton("CEK BARANG");
        bcekbarang.setFont(new java.awt.Font("Tahoma", 0, 30));
        bcekbarang.setBounds(28, 230, 320, 60);
        
        bbarangmsk=new JButton("BARANG MASUK");
        bbarangmsk.setFont(new java.awt.Font("Tahoma", 0, 30));
        bbarangmsk.setBounds(28, 350, 320, 60);
        
        bbarangklr=new JButton("BARANG KELUAR");
        bbarangklr.setFont(new java.awt.Font("Tahoma", 0, 30));
        bbarangklr.setBounds(28, 470, 320, 60);
        
        blogout=new JButton("LOGOUT");
        blogout.setFont(new java.awt.Font("Tahoma", 0, 30));
        blogout.setBounds(28, 590, 320, 60);
        
        add(igudang);
        add(lgudang);
        add(lnamagudang);
        add(bcekbarang);
        add(bbarangmsk);
        add(bbarangklr);
        add(blogout);
        add(porenge);
        add(pputih);
        add(background);
        
        
        setUndecorated(true);
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
    
    }
    public void setnama(String a){
        lnamagudang.setText(a);
    }
    public void bkasir(){
        
    }
    public void blogoutevt(ActionListener a){
        blogout.addActionListener(a);
    }
}
