package Business.Organization;

import java.util.ArrayList;

import Business.Role.FoodSellerRole;
import Business.Role.Role;

public class FoodOrganization extends Organization {

  public FoodOrganization() {
    super(Type.Food.getValue());
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new FoodSellerRole());
    return roles;
  }
}
