/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgElekstore;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Brands extends javax.swing.JFrame {

    
    public Brands() {
        initComponents();
         Connect();
         table_update();
    }
    Connection con;
    PreparedStatement pst;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrandData = new javax.swing.JTable();
        txtBrandID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnBackToMain = new javax.swing.JButton();
        btnAddBrand = new java.awt.Button();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancel.setBackground(new java.awt.Color(102, 102, 255));
        btnCancel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 130, 40));

        tblBrandData.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tblBrandData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BrandID", "Brand Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBrandData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBrandData.setGridColor(new java.awt.Color(255, 255, 255));
        tblBrandData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBrandDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBrandData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 900, 350));

        txtBrandID.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtBrandID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandIDActionPerformed(evt);
            }
        });
        txtBrandID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtBrandID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 260, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Brand ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Brand Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, -1, -1));

        txtBrandName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandNameActionPerformed(evt);
            }
        });
        txtBrandName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBrandNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 260, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Elek2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brands");

        btnBackToMain.setBackground(new java.awt.Color(255, 255, 255));
        btnBackToMain.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBackToMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        btnBackToMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackToMainMousePressed(evt);
            }
        });
        btnBackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(395, 395, 395))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackToMain)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 230));

        btnAddBrand.setBackground(new java.awt.Color(255, 0, 153));
        btnAddBrand.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddBrand.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBrand.setLabel("Add Brand");
        btnAddBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBrandActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 130, 40));

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, 130, 40));

        jPanel1.setBackground(new java.awt.Color(255, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 940, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblBrandDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBrandDataMouseClicked
        
            txtBrandID.setEnabled(false);                                
        // TODO add your handling code here:

        DefaultTableModel d1 = (DefaultTableModel)tblBrandData.getModel();
        int selectIndex = tblBrandData.getSelectedRow();

        txtBrandID.setText(d1.getValueAt(selectIndex, 0).toString());
          txtBrandName.setText(d1.getValueAt(selectIndex, 1).toString());  
            





    }//GEN-LAST:event_tblBrandDataMouseClicked

      public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/team7db","root","");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(TodaySales.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
          //  Logger.getLogger(TodaySales.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
   
            
        public void table_update()
    {
       
            int c;
            try {
               
                 pst = con.prepareStatement("select * from  brands");
                 ResultSet rs = pst.executeQuery();
                 
                 ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)tblBrandData.getModel();
                 d.setRowCount(0);
                                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector();
                     
                     for(int i=0; i<=c; i++)
                     {
                         v2.add(rs.getString("brand_id"));
                         v2.add(rs.getString("brand_title"));
                         
                          
                     }             
                     d.addRow(v2);
                     
                 }
  
                
         
                 
            
            
        } catch (SQLException ex) {
           // Logger.getLogger(TodaySales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
       Main main =new Main();
        main.setVisible(true);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameActionPerformed

    private void txtBrandNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandNameKeyPressed

    private void btnAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBrandActionPerformed

        Connection cn;
        Statement st;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/team7db","root","");

         //   String brandID = txtBrandID.getText();
                String brandName = txtBrandName.getText();

            String query = "insert into brands(brand_title) values('"+ brandName +"')";
            st = cn.createStatement();
            st.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Brand Added");
            table_update();
            //this.setVisible(false);
             
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAddBrandActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        DefaultTableModel d1 = (DefaultTableModel)tblBrandData.getModel();
        int selectIndex = tblBrandData.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());

        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure to Delete this brand?","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION)
        {

            try {
                pst = con.prepareStatement("delete from brands where brand_id ="+"?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Brand Deleted!");
                table_update();
                //txtBrandID.setText("");
                txtBrandName.setText("");
                
                txtBrandName.requestFocus();

                txtBrandName.requestFocus();
            } catch (SQLException ex) {
                Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMainActionPerformed
        Main main =new Main();
        main.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnBackToMainActionPerformed

    private void txtBrandIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBrandIDKeyPressed
        
    }//GEN-LAST:event_txtBrandIDKeyPressed

    private void txtBrandIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandIDActionPerformed
       
    }//GEN-LAST:event_txtBrandIDActionPerformed

    private void btnBackToMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackToMainMousePressed
      btnBackToMain.setBackground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackToMainMousePressed

    
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
            java.util.logging.Logger.getLogger(Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Brands().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAddBrand;
    private javax.swing.JButton btnBackToMain;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JTable tblBrandData;
    private javax.swing.JTextField txtBrandID;
    private javax.swing.JTextField txtBrandName;
    // End of variables declaration//GEN-END:variables
}
