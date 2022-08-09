/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Kasir.Fkasir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.w3c.dom.events.MouseEvent;



/**
 *
 * @author sonys
 */

public class Flogin extends Background{
    private JTextField jtusername;
    private JPasswordField jpassword;
    private JButton  blogin;
    public Flogin(){
        JLabel background=new JLabel();
        background.setIcon(new ImageIcon(getClass().getResource("/gambar/Background/BACKGROUND.jpg")));
        background.setBounds(0, 0, 1366, 768);
        
        JLabel wellcome=new JLabel("Selamat Datang Diaplikasi TokoKu ");
        wellcome.setBounds(420, 90, 800, 65);
        wellcome.setFont(new java.awt.Font("Tahoma", 0, 40));
        
        JLabel text=new JLabel("Silahkan Login Dengan Account Anda");
        text.setBounds(390, 135, 800, 65);
        text.setFont(new java.awt.Font("Tahoma", 0, 40));
        
        JPanel panellogin=new JPanel();
        panellogin.setBackground(new java.awt.Color(255,174,114));
        panellogin.setBounds(393, 230, 650, 500);
        
        JLabel text2=new JLabel("Masukan Username dan Password");
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setBounds(475, 230, 800, 65);
        text2.setFont(new java.awt.Font("Tahoma", 0, 33));
        
        JLabel lusername=new JLabel("Username");
        lusername.setForeground(new java.awt.Color(255, 255, 255));
        lusername.setFont(new java.awt.Font("Tahoma", 0, 35));
        lusername.setBounds(480, 350, 200, 40);
        
        JLabel lpassword=new JLabel("Password");
        lpassword.setForeground(new java.awt.Color(255, 255, 255));
        lpassword.setFont(new java.awt.Font("Tahoma", 0, 35));
        lpassword.setBounds(480, 480, 200, 40);
        
        jtusername=new JTextField();
        jtusername.setFont(new java.awt.Font("Tahoma", 0, 35));
        jtusername.setBounds(700, 350, 250, 40);
        
        jpassword=new JPasswordField();
        jpassword.setFont(new java.awt.Font("Tahoma", 0, 35));
        jpassword.setBounds(700, 480, 250, 40);
        
        blogin=new JButton("Login");
        blogin.setFont(new java.awt.Font("Tahoma", 0, 35));
        blogin.setBounds(640, 600, 150, 45);
       
        add(wellcome);
        add(text);
        add(text2);
        add(lusername);
        add(lpassword);
        add(jtusername);
        add(jpassword);
        add(blogin);
        add(panellogin);
        add(background);
        

        setUndecorated(true);
        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);

    }
    public void blogievent(ActionListener evt){
        blogin.addActionListener(evt);
    }
    public JTextField getusername(){
        return jtusername;
    }
    public JPasswordField getpassword(){
        return jpassword;
    }
}
