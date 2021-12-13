/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {

    //不知道有啥用，如果有需要再comment回来
//    public enum RoleType{
//        Admin("Admin"),
//        Doctor("Doctor"),
//        LabAssistant("Lab Assistant");
//
//        private String value;
//        private RoleType(String value){
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);


    public abstract String getName(); //New Method, 返回这个Role的名字用于前端显示

    @Override
    public String toString() {
        return this.getName();
    }
    
    
}