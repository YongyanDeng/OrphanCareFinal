/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SchoolChairmanOrganization;
import Business.Organization.SchoolReceiveOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.SchoolChairmanRole.SchoolChairmanWorkAreaJPanel;
/**
 *
 * @author zhb970327
 */
public class SchoolChairmanRole extends Role{
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new SchoolChairmanWorkAreaJPanel(userProcessContainer, account, (SchoolChairmanOrganization)organization, enterprise); //测试Panel，用于查看WorkRequest
  }

  @Override
  public String getName() {
    return "School Chairman";
  }
}
