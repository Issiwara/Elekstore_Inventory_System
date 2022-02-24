
package pkgElekstore;

import java.awt.Color;


public class Main extends javax.swing.JFrame {

   
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCategories = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnBrands = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnDailySales = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCategories.setBackground(new java.awt.Color(112, 72, 251));
        btnCategories.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCategories.setForeground(new java.awt.Color(255, 255, 255));
        btnCategories.setText("Categories");
        btnCategories.setIconTextGap(6);
        btnCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCategoriesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCategoriesMouseReleased(evt);
            }
        });
        btnCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 238, 88));

        btnOrders.setBackground(new java.awt.Color(112, 72, 251));
        btnOrders.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setText("Orders");
        btnOrders.setIconTextGap(6);
        btnOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOrdersMousePressed(evt);
            }
        });
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 244, 88));

        btnBrands.setBackground(new java.awt.Color(112, 72, 251));
        btnBrands.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnBrands.setForeground(new java.awt.Color(255, 255, 255));
        btnBrands.setText("Brands");
        btnBrands.setIconTextGap(6);
        btnBrands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBrandsMousePressed(evt);
            }
        });
        btnBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandsActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrands, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 236, 92));

        jButton5.setBackground(new java.awt.Color(112, 72, 251));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Products");
        jButton5.setIconTextGap(6);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 244, 92));

        jButton6.setBackground(new java.awt.Color(112, 72, 251));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Customers");
        jButton6.setIconTextGap(6);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 330, 90));

        btnDailySales.setBackground(new java.awt.Color(112, 72, 251));
        btnDailySales.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDailySales.setForeground(new java.awt.Color(255, 255, 255));
        btnDailySales.setText("Daily Sales");
        btnDailySales.setIconTextGap(6);
        btnDailySales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDailySalesMousePressed(evt);
            }
        });
        btnDailySales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySalesActionPerformed(evt);
            }
        });
        getContentPane().add(btnDailySales, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 270, 90));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jToggleButton2.setBackground(new java.awt.Color(0, 51, 153));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Elek2.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jToggleButton1.setBackground(new java.awt.Color(0, 51, 153));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello Admin");

        btnLogout.setBackground(new java.awt.Color(0, 51, 153));
        btnLogout.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setIconTextGap(6);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutMousePressed(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jToggleButton1)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(40, 40, 40)))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1141, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undraw_building.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 1050, 1010));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandsActionPerformed
          this.hide();
          Brands b = new Brands();
        b.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnBrandsActionPerformed

    private void btnCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriesActionPerformed
               
         this.hide();
       Category cat = new Category();
      
        cat.setVisible(true);
        
        
    }//GEN-LAST:event_btnCategoriesActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
       
         this.hide(); 
        Orders c = new Orders();
        c.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginForm l = new LoginForm();
        l.setVisible(true);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          this.hide();
          Products c = new Products();
        c.setVisible(true);
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          this.hide(); 
        Customers c = new Customers();
          c.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnDailySalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySalesActionPerformed
        // TODO add your handling code here:
          this.hide();
         DailySales c = new DailySales();
          c.setVisible(true);
        
        
    }//GEN-LAST:event_btnDailySalesActionPerformed

    private void btnCategoriesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMouseExited
        // TODO add your handling code here:
       // btnCategories.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnCategoriesMouseExited

    private void btnCategoriesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMouseEntered
        // TODO add your handling code here:
        // btnCategories.setBackground(Color.PINK);
    }//GEN-LAST:event_btnCategoriesMouseEntered

    private void btnCategoriesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMouseReleased
        // TODO add your handling code here:
        //btnCategories.setBackground(Color.RED);
        //[112,72,251]
    }//GEN-LAST:event_btnCategoriesMouseReleased

    private void btnCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMouseClicked
        // TODO add your handling code here:
       //  btnCategories.setBackground(Color.RED);
    }//GEN-LAST:event_btnCategoriesMouseClicked

    private void btnCategoriesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriesMousePressed
        // TODO add your handling code here:
         btnCategories.setBackground(Color.RED);
    }//GEN-LAST:event_btnCategoriesMousePressed

    private void btnOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdersMousePressed
 btnOrders.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdersMousePressed

    private void btnBrandsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrandsMousePressed
 btnBrands.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBrandsMousePressed

    private void btnDailySalesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDailySalesMousePressed
 btnDailySales.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDailySalesMousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
 jButton5.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
 jButton6.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MousePressed

    private void btnLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMousePressed
        // TODO add your handling code here:
        btnLogout.setBackground(Color.red);
    }//GEN-LAST:event_btnLogoutMousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrands;
    private javax.swing.JButton btnCategories;
    private javax.swing.JButton btnDailySales;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
