/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolChairmanRole;
import java.util.ArrayList;
/**
 *
 * @author zhb970327
 */
public class SchoolChairmanOrganization extends Organization {
      private String schoolChairmanOrganization;

    public String getSchoolChairmanOrganization() {
        return schoolChairmanOrganization;
    }

    public void setSchoolChairmanOrganization(String schoolChairmanOrganization) {
        this.schoolChairmanOrganization = schoolChairmanOrganization;
    }
  
  public SchoolChairmanOrganization() {
    super(Type.Chairman.getValue());
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new SchoolChairmanRole());
    return roles;
  }
}
