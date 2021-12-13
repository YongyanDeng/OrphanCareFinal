package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AbleOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.AbleLeaderRole.AbleLeaderJPanel;

/**
 * 健康小孩领队，可以把小孩送去学校，或者把小孩送去运动中心
 * @author yuenasu
 */
public class AbleChildLeaderRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new AbleLeaderJPanel(userProcessContainer, (AbleOrganization) organization, business, account);
  }

  @Override
  public String getName() {
    return "Able Children Leader";
  }
}
