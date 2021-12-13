package Business.Organization;

import java.util.ArrayList;

import Business.Child.Child;
import Business.Child.Children;
import Business.Role.DisableChildAdminRole;
import Business.Role.DisableChildLeaderRole;
import Business.Role.DisablePurchaseRole;
import Business.Role.Role;

/**
 * 残疾小孩福利院
 *
 * @author yuenasu
 */
public class DisableOrganization extends Organization {

    private final Children children;

    public DisableOrganization() {
        super(Type.Disable.getValue());
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
        roles.add(new DisableChildAdminRole());
        roles.add(new DisableChildLeaderRole());
        roles.add(new DisablePurchaseRole());
        return roles;
    }
}
