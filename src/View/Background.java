/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import gambar.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;



/**
 *
 * @author sonys
 */
public class Background extends JFrame{
    protected JLabel tglnow,wktnow;
    
    public Background() {
               
        JPanel header=new JPanel();
        header.setBackground(new java.awt.Color(255, 108, 0));
        header.setSize(1366, 48);
        
        JLabel icon=new JLabel();
        icon.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/keranjang.png")));
        icon.setBounds(3, 2,113, 40);
        
        JLabel logo=new JLabel();
        logo.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/logo v1.png")));
        logo.setBounds(45, 5,113, 40);
        
        JLabel tanggal=new JLabel("Tanggal   ");
        tanggal.setFont(new java.awt.Font("Tahoma", 0, 18));
        tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tanggal.setBounds(500, 3,100, 40);
        
        JLabel waktu=new JLabel("Waktu   ");
        waktu.setFont(new java.awt.Font("Tahoma", 0, 18));
        waktu.setForeground(new java.awt.Color(255, 255, 255));
        waktu.setBounds(800, 3,100, 40);
                
        JLabel tglnow=new JLabel();
        tglnow.setFont(new java.awt.Font("Tahoma", 0, 18));
        tglnow.setForeground(new java.awt.Color(255, 255, 255));
        tglnow.setBounds(593, 3,300, 40);
        tglnow.setText(kalender());
        
        JLabel wktnow=new JLabel();
        wktnow.setFont(new java.awt.Font("Tahoma", 0, 18));
        wktnow.setForeground(new java.awt.Color(255, 255, 255));
        wktnow.setBounds(880, 3,100, 40);
        wktnow.setText(time());
        

    
        
        JButton minimize=new JButton();
        minimize.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/button minimize.png")));
        minimize.setBounds(1270, 2,42, 42);
        minimize.setBackground(new java.awt.Color(255, 108, 0));
        minimize.setBorderPainted(false);
        minimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setState(1);
            }
        });
                
        JButton close=new JButton();
        close.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/button close.png")));
        close.setBounds(1320, 2,42, 42);
        close.setBackground(new java.awt.Color(255, 108, 0));
        close.setBorderPainted(false);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        
        
        add(logo);
        add(icon);
        add(tanggal);
        add(waktu);
        add(tglnow);
        add(wktnow);
        add(minimize);
        add(close);
        
        add(header);

//        kalender();
    }    
    

    public String kalender(){
        String [] bulan={"Januari","Febuari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        Calendar kalender=new GregorianCalendar();
        while(true){    
            Integer year=kalender.get(Calendar.YEAR);    
            Integer month=kalender.get(Calendar.MONTH); 
            Integer day=kalender.get(Calendar.DAY_OF_MONTH); 
//            tglnow.setText(day+" / "+ bulan[month]+" / "+ year);
            return day+" / "+ bulan[month]+" / "+ year;


        }
        
    }
    public String time(){
        Calendar waktu=new GregorianCalendar();
        while (true){    
            Integer jam=waktu.get(Calendar.HOUR_OF_DAY); 
            Integer menit=waktu.get(Calendar.MINUTE); 
            Integer detik=waktu.get(Calendar.SECOND); 
//            wktnow.setText(jam+":"+menit+":"+detik);
            return jam+":"+menit+":"+detik;
        }
    }
}

