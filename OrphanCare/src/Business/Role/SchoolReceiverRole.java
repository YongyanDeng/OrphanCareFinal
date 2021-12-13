package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SchoolReceiveOrganization;
import Business.UserAccount.UserAccount;
import ui.SchoolReceiveRole.SchoolReceiveWorkAreaJPanel;

public class SchoolReceiverRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new SchoolReceiveWorkAreaJPanel(userProcessContainer, account, (SchoolReceiveOrganization)organization, enterprise, business); //测试Panel，用于查看WorkRequest
  }

  @Override
  public String getName() {
    return "School Receiver";
  }
}
