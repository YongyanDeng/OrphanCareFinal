/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PTWorker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dengy
 */
public class PTOrganization extends Organization {

    private String nameOfOrganization;

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public PTOrganization() {
        super(Type.PTOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PTWorker());
        return roles;
    }

}
