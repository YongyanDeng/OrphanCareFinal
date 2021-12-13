package ui.AblePurchaserRole;

import Business.Constant;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Item.Clothes;
import Business.Item.Food;
import Business.Network.Network;
import Business.Organization.ClothesOrganization;
import Business.Organization.Organization;
import Business.Role.ClothesSellerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClothesRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yuenasu
 */
public class OtherChooseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    //private AbleOrganization organization;
    private Enterprise enterprise;
    private UserAccount ua;
    private Organization organization;
    private EcoSystem system;
    private Clothes clothes;
    
    public OtherChooseJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ua = ua;
        this.system = system;
        organization = null;

        populateManuBox();
        populateFoodBox();
    }

    
    private void populateManuBox() {
        boxFood.removeAllItems();

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof ClothesOrganization) {
                        boxFood.addItem(organization);
                    }
                }
            }
        }
    }
    
    private void populateFoodBox() {
        boxFood1.removeAllItems();

        for (Clothes clothes : Clothes.values()){
            boxFood1.addItem(clothes);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        boxFood = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFood = new javax.swing.JTextField();
        boxFood1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(67, 80, 108));

        boxFood.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        boxFood.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFoodActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 235));
        jLabel1.setText("Clothes Manufacturer:");

        btnSend.setBackground(new java.awt.Color(61, 103, 155));
        btnSend.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnSend.setText("Confirm");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtFood.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        boxFood1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        boxFood1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxFood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFood1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 233, 235));
        jLabel2.setText("Clothes Selection:");

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 233, 235));
        jLabel3.setText("Num:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boxFood1, 0, 293, Short.MAX_VALUE)
                                .addComponent(txtFood)
                                .addComponent(boxFood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnBack)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxFood, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boxFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFoodActionPerformed
        // TODO add your handling code here:
        organization = (Organization) boxFood.getSelectedItem();
    }//GEN-LAST:event_boxFoodActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String q = txtFood.getText();
        if (q == null || organization == null || clothes == null || !q.matches(Constant.INT)) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }

        int num = Integer.parseInt(q);
        if(num <= 0){
            JOptionPane.showMessageDialog(null, "Number must be bigger than 0");
            return;
        }
        ClothesRequest fd = new ClothesRequest();
        for (int i = 0; i < num; i++) {
            fd.addCloth(clothes);
        }
        ua.getWorkQueue().getWorkRequestList().add(fd);
        for(UserAccount u : organization.getUserAccountDirectory().getUserAccountList()) {
            if (u.getRole() instanceof ClothesSellerRole) {
                u.getWorkQueue().getWorkRequestList().add(fd);
            }
        }

        JOptionPane.showMessageDialog(null, "request sent successfully");

    }//GEN-LAST:event_btnSendActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxFood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFood1ActionPerformed
        // TODO add your handling code here:
        clothes = (Clothes) boxFood1.getSelectedItem();
    }//GEN-LAST:event_boxFood1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxFood;
    private javax.swing.JComboBox boxFood1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtFood;
    // End of variables declaration//GEN-END:variables
}
