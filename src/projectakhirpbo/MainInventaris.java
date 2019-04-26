package projectakhirpbo;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainInventaris extends javax.swing.JFrame {

    private final int X_MAX = 2; // 0 - 2
    private final int TOTAL_BARANG_CONTOH = 4;
    private List<PanelBarang> listPanelBarang = new ArrayList<PanelBarang>();
    private int currentX = 0;
    private int currentY = 0;

    public MainInventaris() {
        initComponents();
        fillMenuBarangPanel();
    }

    private void fillMenuBarangPanel() {
        GridBagConstraints[] gbc_barang = new GridBagConstraints[TOTAL_BARANG_CONTOH];
        for (int i = 0; i < TOTAL_BARANG_CONTOH; i++) {
            System.out.println("(" + i + ")X=>" + currentX + " , Y=>" + currentY);
            gbc_barang[i] = new GridBagConstraints();
            gbc_barang[i].gridx = currentX;
            gbc_barang[i].gridy = currentY;
            gbc_barang[i].insets = new Insets(4, 4, 4, 4);
            currentY = (currentX != X_MAX) ? currentY : currentY + 1;
            currentX = (currentX != X_MAX) ? currentX + 1 : 0;
            PanelMenuBarang.add(new PanelBarang(), gbc_barang[i]);
            PanelMenuBarang.revalidate();
            PanelMenuBarang.updateUI();
            System.out.println(PanelMenuBarang.getComponentCount());

        }
        PanelMenuBarang.revalidate();
        PanelMenuBarang.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBarang = new javax.swing.JPanel();
        PanelBarang_Gambar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelMenuBarang = new javax.swing.JPanel();

        PanelBarang.setBackground(new java.awt.Color(116, 185, 255));

        PanelBarang_Gambar.setBackground(new java.awt.Color(9, 132, 227));

        javax.swing.GroupLayout PanelBarang_GambarLayout = new javax.swing.GroupLayout(PanelBarang_Gambar);
        PanelBarang_Gambar.setLayout(PanelBarang_GambarLayout);
        PanelBarang_GambarLayout.setHorizontalGroup(
            PanelBarang_GambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        PanelBarang_GambarLayout.setVerticalGroup(
            PanelBarang_GambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelBarangLayout = new javax.swing.GroupLayout(PanelBarang);
        PanelBarang.setLayout(PanelBarangLayout);
        PanelBarangLayout.setHorizontalGroup(
            PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBarang_Gambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBarangLayout.setVerticalGroup(
            PanelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBarang_Gambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Manajemen Inventaris");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PanelMenuBarang.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenuBarang.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(PanelMenuBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(255, 255, 255))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GridBagConstraints gbc_barang = new GridBagConstraints();
        gbc_barang.gridx = currentX;
        gbc_barang.gridy = currentY;
        gbc_barang.insets = new Insets(4, 4, 4, 4);
        currentY = (currentX != X_MAX) ? currentY : currentY + 1;
        currentX = (currentX != X_MAX) ? currentX + 1 : 0;
        PanelMenuBarang.add(new PanelBarang(),gbc_barang);
        PanelMenuBarang.updateUI();
        PanelMenuBarang.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInventaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelBarang;
    private javax.swing.JPanel PanelBarang_Gambar;
    private javax.swing.JPanel PanelMenuBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
