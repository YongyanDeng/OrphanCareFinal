package Business.Organization;

import java.util.ArrayList;

import Business.Role.Role;
import Business.Role.SchoolReceiverRole;

public class SchoolReceiveOrganization extends Organization {
    
  private String schoolReceiveOrganization;

    public String getSchoolReceiveOrganization() {
        return schoolReceiveOrganization;
    }

    public void setSchoolReceiveOrganization(String schoolReceiveOrganization) {
        this.schoolReceiveOrganization = schoolReceiveOrganization;
    }
  
  public SchoolReceiveOrganization() {
    super(Type.Receive.getValue());
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new SchoolReceiverRole());
    return roles;
  }
}
