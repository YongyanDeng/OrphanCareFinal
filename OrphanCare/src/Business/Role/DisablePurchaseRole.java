package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DisableOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.DisablePurchaserRole.DisablePurchaserWorkAreaJPanel;

/**
 * 管理残疾小孩福利院的采购事项
 *
 * @author yuenasu
 */
public class DisablePurchaseRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DisablePurchaserWorkAreaJPanel(userProcessContainer, (DisableOrganization) organization, enterprise, account, business);
    }

    @Override
    public String getName() {
        return "Disable Purchaser";
    }
}
