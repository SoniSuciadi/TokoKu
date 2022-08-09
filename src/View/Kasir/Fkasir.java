/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Kasir;

import Model.Barang;
import View.Background;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author sonys
 */
public class Fkasir extends Background{
    JLabel lnamakasir;
    private JButton bkasir,bcekharga,bdisplayjual, blogout;
    private JComboBox jcbnamapelanggan,jcbnamabarang;
    public  Fkasir (){
        JLabel background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/BACKGROUND.jpg")));
        background.setBounds(0, 0, 1366, 768);
        
        JPanel porenge=new JPanel();
        porenge.setBackground(new java.awt.Color(255,174,114));
        porenge.setBounds(0, 150, 380, 650);
        
        JPanel pputih=new JPanel();
        pputih.setBackground(Color.WHITE);
        pputih.setBounds(0, 45, 380, 110);
        
        JLabel ikasir=new JLabel();
        ikasir.setIcon(new ImageIcon(getClass().getResource("/gambar/kasir/kasir.png")));
        ikasir.setBounds(10 , 56, 87,87);
        
        JLabel lkasir=new JLabel("K A S I R");
        lkasir.setFont(new java.awt.Font("Tahoma", 0, 30));
        lkasir.setBounds(120, 50, 250, 40);
        
        lnamakasir=new JLabel("Nama Kasir");
        lnamakasir.setFont(new java.awt.Font("Tahoma", 0, 30));
        lnamakasir.setBounds(120, 90, 250, 40);
        lnamakasir.setForeground(Color.red);
        
        bkasir=new JButton("K A S I R");
        bkasir.setFont(new java.awt.Font("Tahoma", 0, 30));
        bkasir.setBounds(28, 230, 320, 60);
                
        bcekharga=new JButton("CEK HARGA");
        bcekharga.setFont(new java.awt.Font("Tahoma", 0, 30));
        bcekharga.setBounds(28, 350, 320, 60);
        
        bdisplayjual=new JButton("DISPLAY PENJUALAN");
        bdisplayjual.setFont(new java.awt.Font("Tahoma", 0, 30));
        bdisplayjual.setBounds(28, 470, 320, 60);
        
        blogout=new JButton("LOGOUT");
        blogout.setFont(new java.awt.Font("Tahoma", 0, 30));
        blogout.setBounds(28, 590, 320, 60);
        
        add(ikasir);
        add(lkasir);
        add(lnamakasir);
        add(bkasir);
        add(bcekharga);
        add(bdisplayjual);
        add(blogout);
        add(porenge);
        add(pputih);
//        add(background);
        

    }
    public void setnama(String a){
        lnamakasir.setText(a);
    }
    public void blogoutevt(ActionListener a){
        blogout.addActionListener(a);
    }
    public void kasir (ResultSet barang, ResultSet pelanggan, ResultSet detailpenjualan, ResultSet penjualan) throws SQLException{
        
        JPanel pkasir=new JPanel();
        pkasir.setBackground(Color.WHITE);
        pkasir.setBounds(400, 150, 400, 600);
        
        JLabel lkpembeli=new JLabel("ID Pelanggan ");
        lkpembeli.setBounds(410, 155, 130, 50);
        lkpembeli.setFont(new java.awt.Font("Calibri", 1, 22));
        lkpembeli.setForeground(Color.BLACK);
        
        JLabel kpembeli=new JLabel("IDPelanggan");
        kpembeli.setBounds(610, 155, 130, 50);
        kpembeli.setFont(new java.awt.Font("Calibri", 1, 22));
        kpembeli.setForeground(Color.BLACK);
        
        JLabel lpembeli=new JLabel("Pelanggan");
        lpembeli.setBounds(410, 225, 130, 50);
        lpembeli.setFont(new java.awt.Font("Calibri", 1, 22));
        lpembeli.setForeground(Color.BLACK);
        
        jcbnamapelanggan=new JComboBox();
        while(pelanggan.next()){
            jcbnamapelanggan.addItem(pelanggan.getString(2));
        }
        AutoCompleteDecorator.decorate(jcbnamapelanggan);
        jcbnamapelanggan.setBounds(610, 235, 160, 30);
        jcbnamapelanggan.setFont(new java.awt.Font("Calibri", 0, 21));
        jcbnamapelanggan.setForeground(Color.BLACK);
                
        JLabel lkode=new JLabel("Kode       ");
        lkode.setBounds(410,295, 130, 50);
        lkode.setFont(new java.awt.Font("Calibri", 1, 22));
        lkode.setForeground(Color.BLACK);
        
        JLabel kode=new JLabel("kode");
        kode.setBounds(610, 295, 130, 50);
        kode.setFont(new java.awt.Font("Calibri", 1, 22));
        kode.setForeground(Color.BLACK);
        
        JLabel lnama=new JLabel("Nama         ");
        lnama.setBounds(410, 365, 130, 50);
        lnama.setFont(new java.awt.Font("Calibri", 1, 22));
        lnama.setForeground(Color.BLACK);
        
        jcbnamabarang=new JComboBox();

        while(barang.next()){
            jcbnamabarang.addItem(barang.getString(2));
        }
        
        AutoCompleteDecorator.decorate(jcbnamabarang);
        jcbnamabarang.setBounds(610, 375, 160, 30);
        jcbnamabarang.setFont(new java.awt.Font("Calibri", 0, 20));
        jcbnamabarang.setForeground(Color.BLACK);
        
        JLabel lharga=new JLabel("Harga      ");
        lharga.setBounds(410, 435, 130, 50);
        lharga.setFont(new java.awt.Font("Calibri", 1, 22));
        lharga.setForeground(Color.BLACK);
        
        JLabel harga=new JLabel("harga");
        harga.setBounds(610, 435, 130, 50);
        harga.setFont(new java.awt.Font("Calibri", 1, 22));
        harga.setForeground(Color.BLACK);
        
        JLabel lstok=new JLabel("Stok ");
        lstok.setBounds(410, 505, 130, 50);
        lstok.setFont(new java.awt.Font("Calibri", 1, 22));
        lstok.setForeground(Color.BLACK);
        
        JLabel stok=new JLabel("Stok");
        stok.setBounds(610, 505, 130, 50);
        stok.setFont(new java.awt.Font("Calibri", 1, 22));
        stok.setForeground(Color.BLACK);
        
        
        add(lkpembeli);
        add(kpembeli);
        add(lpembeli);
        add(jcbnamapelanggan);
        add(lkode);
        add(kode);
        add(lnama);
        add(jcbnamabarang);
        add(lharga);
        add(harga);
        add(lstok);
        add(stok);
        add(pkasir);
        
        
        setUndecorated(true);
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
    }

    

    
}
