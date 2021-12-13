/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

import Business.Role.ClothesSellerRole;
import Business.Role.Role;

/**
 *
 * @author zhb970327
 */
public class ClothesOrganization extends Organization{
    public ClothesOrganization() {
    super(Type.Clothes.getValue());
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new ClothesSellerRole());
    return roles;
  }
}
