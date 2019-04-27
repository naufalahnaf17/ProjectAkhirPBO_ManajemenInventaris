package ManajemenInventaris;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Pengembalian_PengembalianBerhasilPanel extends javax.swing.JPanel {

    private Manajemen_Main parent = null;
    
    public Pengembalian_PengembalianBerhasilPanel(Manajemen_Main parent) throws IOException{
        this.parent = parent;
        initComponents();
        
        label_gambarBerhasil.setBackground(Color.WHITE);
        BufferedImage berhasilPengembalian = ImageIO.read(new File("image\\Main_Pengembalian_Berhasil.png"));
        label_gambarBerhasil.setIcon(new ImageIcon(berhasilPengembalian.getScaledInstance(berhasilPengembalian.getWidth(), berhasilPengembalian.getHeight(), Image.SCALE_SMOOTH)));
        label_gambarBerhasil.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_gambarBerhasil = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        label_gambarBerhasil.setBackground(new java.awt.Color(153, 153, 153));
        label_gambarBerhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_gambarBerhasil.setText("gambar_berhasil");
        label_gambarBerhasil.setOpaque(true);
        label_gambarBerhasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_gambarBerhasilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_gambarBerhasil, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_gambarBerhasil, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void label_gambarBerhasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_gambarBerhasilMouseClicked
        this.parent.backToHome(this);
    }//GEN-LAST:event_label_gambarBerhasilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label_gambarBerhasil;
    // End of variables declaration//GEN-END:variables
}
