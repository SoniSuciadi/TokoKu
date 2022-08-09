/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Adm;

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
public class FAdm extends Background{
    JLabel lnamaadm;
    JButton bmbarang,bdisplayincome,bpembelian,blogout;
    public FAdm (){
        JLabel background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/BACKGROUND.jpg")));
        background.setBounds(0, 0, 1366, 768);
        
        JPanel porenge=new JPanel();
        porenge.setBackground(new java.awt.Color(255,174,114));
        porenge.setBounds(0, 150, 380, 650);
        
        JPanel pputih=new JPanel();
        pputih.setBackground(Color.WHITE);
        pputih.setBounds(0, 45, 380, 110);
        
        JLabel iadm=new JLabel();
        iadm.setIcon(new ImageIcon(getClass().getResource("/gambar/adm/adm.png")));
        iadm.setBounds(10 , 56, 87,87);
        
        JLabel ladm=new JLabel("ADMINISTRATOR");
        ladm.setFont(new java.awt.Font("Tahoma", 0, 30));
        ladm.setBounds(120, 50, 250, 40);
        
        lnamaadm=new JLabel("Nama Kasir");
        lnamaadm.setFont(new java.awt.Font("Tahoma", 0, 30));
        lnamaadm.setBounds(120, 90, 250, 40);
        lnamaadm.setForeground(Color.red);
        
        bmbarang=new JButton("MANAGEMENT BARANG");
        bmbarang.setFont(new java.awt.Font("Tahoma", 0, 25));
        bmbarang.setBounds(28, 230, 320, 60);
        
        bdisplayincome=new JButton("DISPLAY INCOME");
        bdisplayincome.setFont(new java.awt.Font("Tahoma", 0, 30));
        bdisplayincome.setBounds(28, 350, 320, 60);
        
        bpembelian=new JButton("PEMBELIAN");
        bpembelian.setFont(new java.awt.Font("Tahoma", 0, 30));
        bpembelian.setBounds(28, 470, 320, 60);
        
        blogout=new JButton("LOGOUT");
        blogout.setFont(new java.awt.Font("Tahoma", 0, 30));
        blogout.setBounds(28, 590, 320, 60);
        
        add(iadm);
        add(ladm);
        add(lnamaadm);
        add(bmbarang);
        add(bdisplayincome);
        add(bpembelian);
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
        lnamaadm.setText(a);
    }
    public void blogoutevt(ActionListener a){
        blogout.addActionListener(a);
    }
}
