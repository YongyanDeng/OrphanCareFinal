/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    private Enterprise.EnterpriseType enter;

    public AdminRole() {}

    public AdminRole(Enterprise.EnterpriseType e) {
        enter = e;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public String getName() {
        return "Admin";
    }


}
