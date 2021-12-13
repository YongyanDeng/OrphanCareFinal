package Business.Organization;

import java.util.ArrayList;

import Business.Child.Child;
import Business.Child.Children;
import Business.Role.AbleChildAdminRole;
import Business.Role.AbleChildLeaderRole;
import Business.Role.AblePurchaseRole;
import Business.Role.Role;

/**
 * 健康小孩福利院
 *
 * @author yuenasu
 */
public class AbleOrganization extends Organization {

    private final Children children;

    public AbleOrganization() {
        super(Type.Able.getValue());
        children = new Children();
    }

    public void addChild(Child c) {
        children.add(c);
    }

    public void removeChild(Child c) {
        children.remove(c);
    }

    public Children getChildren() {
        return children;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AbleChildAdminRole());
        roles.add(new AblePurchaseRole());
        roles.add(new AbleChildLeaderRole());
        return roles;
    }

}
