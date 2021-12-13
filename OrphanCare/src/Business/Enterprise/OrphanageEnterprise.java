package Business.Enterprise;

import java.util.ArrayList;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 * 孤儿院，有健康孤儿福利院和残疾小孩福利院
 * @author yuenasu
 */
public class OrphanageEnterprise extends Enterprise {

  public OrphanageEnterprise(String name) {
    super(name, EnterpriseType.Orphanage);
  }

  //关联Enterprise和Organization，这样Enterprise的Admin就只能管自己的Organization
  @Override
  public ArrayList<Organization.Type> getSupportedOrg() {
    ArrayList<Organization.Type> res = new ArrayList<>();
    res.add(Type.Able);
    res.add(Type.Disable);
    return res;
  }

  @Override
  public ArrayList<Role> getSupportedRole() {
    return null;
  }
}
