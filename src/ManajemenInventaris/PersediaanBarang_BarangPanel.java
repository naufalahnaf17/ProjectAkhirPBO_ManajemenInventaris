package ManajemenInventaris;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class PersediaanBarang_BarangPanel extends javax.swing.JPanel {

    public int idbarang;
    private Manajemen_PersediaanBarangPanel parent = null;
    
    //Digunakan pada masa pengembangan
    private String barcodeid;
    private String namaBarang;
    private int kuantitas;
    private BufferedImage gambarBarang;
    
    public PersediaanBarang_BarangPanel(Manajemen_PersediaanBarangPanel parent) {
        initComponents();
    }
    
    public PersediaanBarang_BarangPanel(Manajemen_PersediaanBarangPanel parent,int idbarang) {
        
    }
    
    public PersediaanBarang_BarangPanel(Manajemen_PersediaanBarangPanel parent,String namaBarang,BufferedImage gambarBarang,String barcodeid) {
        initComponents();
        this.parent = parent;
        this.barcodeid = barcodeid;
        this.namaBarang = namaBarang;
        this.kuantitas = 0;
        this.gambarBarang = gambarBarang;
        label_namabarang.setText(namaBarang);
        if (gambarBarang != null) {
            Dimension scaledDimension = this.parent.parent.getScaledDimension(new Dimension(gambarBarang.getWidth(),gambarBarang.getHeight()), new Dimension(239, 144));
            label_gambarbarang.setIcon(new ImageIcon(gambarBarang.getScaledInstance((int)scaledDimension.getWidth(),(int)scaledDimension.getHeight(), Image.SCALE_SMOOTH)));
            label_gambarbarang.setText("");
        }else {
            label_gambarbarang.setText("Gambar tidak ada");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_gambarbarang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label_namabarang = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_gambarbarang.setBackground(new java.awt.Color(255, 255, 255));
        label_gambarbarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_gambarbarang.setText("gambar_item");
        label_gambarbarang.setOpaque(true);
        label_gambarbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_gambarbarangMouseClicked(evt);
            }
        });
        add(label_gambarbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 239, 144));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nama Barang: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        label_namabarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label_namabarang.setText("{nama_barang}");
        add(label_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 150, 147, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void label_gambarbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_gambarbarangMouseClicked
        
    }//GEN-LAST:event_label_gambarbarangMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_gambarbarang;
    private javax.swing.JLabel label_namabarang;
    // End of variables declaration//GEN-END:variables
}
