package Business.Enterprise;

import java.util.ArrayList;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 * 学校，有接收中心和注册确认中心
 */
public class SchoolEnterprise extends Enterprise {

  public SchoolEnterprise(String name) {
    super(name, EnterpriseType.School);
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }

  @Override
  public ArrayList<Type> getSupportedOrg() {
    ArrayList<Organization.Type> res = new ArrayList<>();
    res.add(Type.Receive);
    res.add(Type.Chairman);
    //TODO, 加上此Enterprise关联的Org
    //res.add(Type.Clothes);
    return res;
  }
}
