/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author sonys
 */
public class frame1 extends javax.swing.JFrame {
    Integer kategori;
    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
        setVisible(true);
        kalender();
               
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("uncecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        ltanggal = new javax.swing.JLabel();
        lwaktu = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        wkt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 174, 114));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ltanggal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ltanggal.setForeground(new java.awt.Color(255, 255, 255));
        ltanggal.setText("Tanggal ");
        header.add(ltanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 30));

        lwaktu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lwaktu.setForeground(new java.awt.Color(255, 255, 255));
        lwaktu.setText("Waktu  ");
        header.add(lwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 50));

        tgl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 255, 255));
        header.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 220, 30));

        wkt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wkt.setForeground(new java.awt.Color(255, 255, 255));
        header.add(wkt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 220, 50));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 50));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Background/BACKGROUND.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kasir/kasir.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jCheckBox1.setText("jCheckBox1");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }
    public void kalender(){
    String [] bulan={"Januari","Febuari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    while(true){
        Calendar kalender=new GregorianCalendar();
        Integer year=kalender.get(Calendar.YEAR);    
        Integer month=kalender.get(Calendar.MONTH); 
        Integer day=kalender.get(Calendar.DAY_OF_MONTH); 
        Integer jam=kalender.get(Calendar.HOUR_OF_DAY); 
        Integer menit=kalender.get(Calendar.MINUTE); 
        Integer detik=kalender.get(Calendar.SECOND); 
        String tanggal=day+" / "+ bulan[month]+" / "+ year;
        String waktu=jam+":"+menit+":"+detik;
        tgl.setText(tanggal);
        wkt.setText(waktu);
        System.out.println(tanggal);
        System.out.println(waktu);
    }   

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ltanggal;
    private javax.swing.JLabel lwaktu;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel wkt;
    // End of variables declaration//GEN-END:variables
}
