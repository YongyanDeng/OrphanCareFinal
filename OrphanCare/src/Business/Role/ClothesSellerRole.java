/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.ClothesSellerRole.ClothesSellerJPanel;
/**
 *
 * @author zhb970327
 */
public class ClothesSellerRole extends Role{
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new ClothesSellerJPanel(account, business); //测试Panel，用于查看WorkRequest
  }

  @Override
  public String getName() {
    return "Clothes Seller";
  }
}
