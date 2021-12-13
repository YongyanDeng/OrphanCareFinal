/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessEnterprise;
import Business.Organization.Organization;
import Business.Organization.PTOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.GymRole.PTWorkAreaJPanel;

/**
 *
 * @author dengy
 */
public class PTWorker extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PTWorkAreaJPanel(userProcessContainer, account, (PTOrganization) organization, (FitnessEnterprise) enterprise); //测试Panel，用于查看WorkRequest
    }

    @Override
    public String getName() {
        return "PT Fitness Worker";
    }
    
}
