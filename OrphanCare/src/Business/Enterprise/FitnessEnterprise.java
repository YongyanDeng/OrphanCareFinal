package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;

import Business.Role.Role;

public class FitnessEnterprise extends Enterprise {

    public FitnessEnterprise(String name) {
        super(name, EnterpriseType.Fitness);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public ArrayList<Type> getSupportedOrg() {

        ArrayList<Organization.Type> res = new ArrayList<>();
        res.add(Type.DisableRecoverOrganization);
        res.add(Type.PTOrganization);
        return res;

    }

}
