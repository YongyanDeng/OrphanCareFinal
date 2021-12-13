package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AbleOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.AbleChildAdminRole.AbleChildAdminWorkAreaJPanel;

/**
 * 管理健康小孩福利院的注册和注销
 * @author yuenasu
 */
public class AbleChildAdminRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new AbleChildAdminWorkAreaJPanel(userProcessContainer, (AbleOrganization) organization);
  }

  @Override
  public String getName() {
    return "Able Children Admin";
  }
}
