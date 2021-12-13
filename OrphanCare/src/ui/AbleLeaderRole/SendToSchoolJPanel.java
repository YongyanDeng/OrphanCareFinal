package ui.AbleLeaderRole;

import Business.Child.Child;
import Business.Constant;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SchoolEnterprise;
import Business.Network.Network;
import Business.Organization.AbleOrganization;
import Business.Organization.Organization;
import Business.Organization.SchoolReceiveOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SendToSchoolRequest;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yuenasu
 */
public class SendToSchoolJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TherapistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private AbleOrganization organization;
    private EcoSystem system;
    private UserAccount ua;
    private SchoolEnterprise school;
    private Child child = null;

    public SendToSchoolJPanel(JPanel userProcessContainer, AbleOrganization organization, EcoSystem system, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.system = system;
        this.ua = ua;
        school = null;

        populateSchoolBox();

    }

    private void populateSchoolBox() {
        boxHospital.removeAllItems();

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof SchoolEnterprise) {
                    boxHospital.addItem(e);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblExam = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxHospital = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(67, 80, 108));

        tblExam.setBackground(new java.awt.Color(102, 102, 102));
        tblExam.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        tblExam.setForeground(new java.awt.Color(255, 255, 255));
        tblExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Child Name", "School Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExam);

        txtID.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(61, 103, 155));
        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(61, 103, 155));
        btnSend.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnSend.setText("Send to School");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 233, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Child Education");

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel2.setText("<Leader>");

        jLabel4.setBackground(new java.awt.Color(233, 233, 235));
        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 233, 235));
        jLabel4.setText("ID:");

        jButton3.setText("jButton3");

        jButton4.setBackground(new java.awt.Color(61, 103, 155));
        jButton4.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 233, 235));
        jLabel3.setText("School:");

        boxHospital.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        boxHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHospitalActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(61, 103, 155));
        btnDelete.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(790, 790, 790)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(boxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(btnDelete))
                    .addComponent(btnSend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id = txtID.getText();
        if (!id.matches(Constant.INT)) {
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }

        for (Child c : organization.getChildren().getChildren()) {
            if (c.getId() == Integer.parseInt(id)) {
                child = c;
                DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
                model.setRowCount(0);
                model.addRow(new String[]{c.getName(), c.getSchool(),  c.getSchoolStatus()});
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Child not found.");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        populateExamRequestTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        if (school == null || child == null) {
            JOptionPane.showMessageDialog(null, "invalid input");
            return;
        }

        for (Organization o : school.getOrganizationDirectory().getOrganizationList()) {
            if (o instanceof SchoolReceiveOrganization) {
                for (UserAccount u : o.getUserAccountDirectory().getUserAccountList()) {
                    SendToSchoolRequest sr = new SendToSchoolRequest(child);
                    sr.getChild().setSchool(school.getName());
                    ua.getWorkQueue().getWorkRequestList().add(sr);
                    u.getWorkQueue().getWorkRequestList().add(sr);
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Child Sent");
        populateExamRequestTable();

    }//GEN-LAST:event_btnSendActionPerformed

    private void boxHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHospitalActionPerformed
        // TODO add your handling code here:
        school = (SchoolEnterprise) boxHospital.getSelectedItem();
    }//GEN-LAST:event_boxHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Integer selectedRow = tblExam.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table");
            return;
        }

        Child child = (Child) tblExam.getValueAt(selectedRow, 0);

        if (!child.getSchoolStatus().equals("Rejected") || !child.getFitnessStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(null, "This child has been sent to a school/gym!");
            return;
        }

        organization.removeChild(child);
        populateExamRequestTable();

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxHospital;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExam;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void populateExamRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
        model.setRowCount(0);

        for (Child c : organization.getChildren().getChildren()) {
            Object[] row = new Object[3];

            row[0] = c;
            row[1] = c.getSchool();
            row[2] = c.getSchoolStatus();
            model.addRow(row);

        }
    }

}