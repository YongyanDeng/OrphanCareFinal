/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        //TODO, 添加或者修改Enterprise
        Orphanage("Orphanage"),
        Fitness("Fitness"),
        School("School"),
        Wholesaler("Wholesaler");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    //关联Enterprise和Organization，这样Enterprise的Admin就只能管自己的Organization
    public abstract ArrayList<Type> getSupportedOrg();

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
