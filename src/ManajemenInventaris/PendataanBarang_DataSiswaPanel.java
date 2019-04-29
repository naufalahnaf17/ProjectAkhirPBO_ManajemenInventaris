package ManajemenInventaris;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PendataanBarang_DataSiswaPanel extends javax.swing.JPanel {

    private Manajemen_Main parent = null;
    private Manajemen_PendataanBarangPanel docker = null;

    public PendataanBarang_DataSiswaPanel(Manajemen_Main parent, Manajemen_PendataanBarangPanel docker) throws IOException {
        this.parent = parent;
        this.docker = docker;
        initComponents();
    }

    private void readData() {
        String[] kolomTabel = {"NIS", "Nama", "Kelas", "Jurusan"};
        defaultTableModel = new DefaultTableModel(null, kolomTabel);
        try {
            connection = DB.getConnection();
            preStatement = connection.prepareStatement("SELECT * from murid ");
            //System.out.println(preStatement);
            result = preStatement.executeQuery();
            while (result.next()) {
                String nis = result.getString("nis");
                String nama = result.getString("nama");
                String kelas = result.getString("kelas");
                String jurusan = result.getString("jurusan");

                defaultTableModel.addRow(new String[]{nis, nama, kelas, jurusan});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ada Kesalahan Query");
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        siswa_tabel.setModel(defaultTableModel);
        initTableColumn();
    }

    private void initTableColumn() {
        DefaultTableCellRenderer dtr = new DefaultTableCellRenderer();
        dtr.setHorizontalAlignment(JLabel.CENTER);
        siswa_tabel.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        if (siswa_tabel.getColumnModel().getColumnCount() > 0) {

            for (int i = 0; i < siswa_tabel.getColumnCount(); i++) {
                siswa_tabel.getColumnModel().getColumn(i).setCellRenderer(dtr);
            }
            ((DefaultTableCellRenderer) siswa_tabel.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
//        siswa_tabel.getColumnModel().getColumn(0).setCellRenderer(dtr);
//        siswa_tabel.getColumnModel().getColumn(1).setCellRenderer(dtr);
//        siswa_tabel.getColumnModel().getColumn(2).setCellRenderer(dtr);
//        siswa_tabel.getColumnModel().getColumn(3).setCellRenderer(dtr);
        }
        
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pinjamHistory1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        table_pinjamHistory1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        table_pinjamHistory1.setForeground(new java.awt.Color(51, 153, 255));
        table_pinjamHistory1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIS", "NAMA", "KELAS", "JURUSAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_pinjamHistory1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_pinjamHistory1.setFillsViewportHeight(true);
        table_pinjamHistory1.setGridColor(new java.awt.Color(51, 153, 255));
        table_pinjamHistory1.setOpaque(false);
        table_pinjamHistory1.setRowHeight(40);
        table_pinjamHistory1.setRowSelectionAllowed(false);
        table_pinjamHistory1.setSelectionForeground(new java.awt.Color(51, 153, 255));
        jScrollPane2.setViewportView(table_pinjamHistory1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_pinjamHistory1;
    // End of variables declaration//GEN-END:variables
}
