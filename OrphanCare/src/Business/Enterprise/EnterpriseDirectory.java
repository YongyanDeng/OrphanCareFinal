/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        //TODO, 添加或者修改Enterprise
        switch (type) {
            case Orphanage:
                enterprise = new OrphanageEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case School:
                enterprise = new SchoolEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Fitness:
                enterprise = new FitnessEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Wholesaler:
                enterprise = new WholesalerEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }

        return enterprise;
    }
}
