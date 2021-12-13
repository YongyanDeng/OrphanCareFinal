package Business.Role;

import javax.swing.JPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.FoodSellerRole.FoodSellerJPanel;

/**
 * 卖菜的
 */
public class FoodSellerRole extends Role {
  @Override
  public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
    return new FoodSellerJPanel(account, business); //测试Panel，用于查看WorkRequest
  }

  @Override
  public String getName() {
    return "Food Seller";
  }
}
