package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DisableOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.DisableLeaderRole.SendToDisableRecoverOrganizationJPanel;

/**
 * 残疾小孩领队，可以把残疾小孩送去康复中心
 * @author yuenasu
 */
public class DisableChildLeaderRole extends Role{
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new SendToDisableRecoverOrganizationJPanel(userProcessContainer, (DisableOrganization) organization, business, account);
  }

  @Override
  public String getName() {
    return "Disable Children Leader";
  }
}
