package Business.Enterprise;

import java.util.ArrayList;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 * 批发商，有食品批发商和衣服批发商
 */
public class WholesalerEnterprise extends Enterprise {

  public WholesalerEnterprise(String name) {
    super(name, EnterpriseType.Wholesaler);
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }

  @Override
  public ArrayList<Type> getSupportedOrg() {
    ArrayList<Organization.Type> res = new ArrayList<>();
    res.add(Type.Food);
    res.add(Type.Clothes);
    //TODO, 加上此Enterprise关联的Org
    //res.add(Type.Clothes);
    return res;
  }
}
