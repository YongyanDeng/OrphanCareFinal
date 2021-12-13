/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DisableFitnessWorker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author dengy
 */
public class DisableRecoverOrganization extends Organization {

    private String nameOfOrganization;

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public DisableRecoverOrganization() {
        super(Type.DisableRecoverOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DisableFitnessWorker());
        return roles;
    }

}
