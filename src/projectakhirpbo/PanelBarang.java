package projectakhirpbo;

import javax.swing.JPanel;

public class PanelBarang extends JPanel {

    javax.swing.GroupLayout PanelBarangLayout;    
    JPanel PanelBarang_Gambar;
    
    public PanelBarang() {
        initPanel();
    }
    
    private void initPanel() {
        PanelBarang_Gambar = new JPanel();
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
        
        PanelBarangLayout =  new javax.swing.GroupLayout(PanelBarang.this);
        this.setBackground(new java.awt.Color(116, 185, 255));
        this.setLayout(PanelBarangLayout);       
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
    }
}
