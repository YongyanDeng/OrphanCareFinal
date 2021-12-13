package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AbleOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.AblePurchaserRole.AblePurchaserWorkAreaJPanel;

/**
 * 管理健康福利院的采购事项
 * @author yuenasu
 */
public class AblePurchaseRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new AblePurchaserWorkAreaJPanel(userProcessContainer, (AbleOrganization) organization, enterprise, account, business);
  }

  @Override
  public String getName() {
    return "Able Purchaser";
  }
}
