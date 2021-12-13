package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DisableOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.DisableChildAdminRole.DisableChildAdminWorkAreaJPanel;

/**
 * 管理残疾小孩福利院的注册
 * @author yuenasu
 */
public class DisableChildAdminRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new DisableChildAdminWorkAreaJPanel(userProcessContainer, (DisableOrganization) organization);
  }

  @Override
  public String getName() {
    return "Disable Children Admin";
  }
}
