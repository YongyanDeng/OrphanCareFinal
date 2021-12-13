/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        switch (type) {
            //TODO, 添加或修改Organization
            case Able:
                organization = new AbleOrganization();
                organizationList.add(organization);
                break;
            case Disable:
                organization = new DisableOrganization();
                organizationList.add(organization);
                break;
            case Food:
                organization = new FoodOrganization();
                organizationList.add(organization);
                break;
            case Clothes:
                organization = new ClothesOrganization();
                organizationList.add(organization);
                break;
            case Chairman:
                organization = new SchoolChairmanOrganization();
                organizationList.add(organization);
                break;
            case Receive:
                organization = new SchoolReceiveOrganization();
                organizationList.add(organization);
                break;
            case DisableRecoverOrganization:
                organization = new DisableRecoverOrganization();
                organizationList.add(organization);
                break;
            case PTOrganization:
                organization = new PTOrganization();
                organizationList.add(organization);
                break;
            default:
                break;
        }

        return organization;
    }
}
