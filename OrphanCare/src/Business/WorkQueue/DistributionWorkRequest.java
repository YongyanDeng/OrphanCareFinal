/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import Business.Child.Child;
/**
 *
 * @author zhb970327
 */
public class DistributionWorkRequest extends WorkRequest{
    
    private ArrayList<String> classList = new ArrayList<>();
    private String distrReqId;
    private Child child;
    private String comments;
    private String childname;
    private SendToSchoolRequest sendtoschool;

    public ArrayList<String> getClassList() {
        return classList;
    }

    public void setClassList(ArrayList<String> classList) {
        this.classList = classList;
    }

    public String getDistrReqId() {
        return distrReqId;
    }

    public void setDistrReqId(String distrReqId) {
        this.distrReqId = distrReqId;
    }

    public SendToSchoolRequest getSendtoschool() {
        return sendtoschool;
    }

    public void setSendtoschool(SendToSchoolRequest sendtoschool) {
        this.sendtoschool = sendtoschool;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getChildname() {
        return childname;
    }

    public void setChildname(String childname) {
        this.childname = childname;
    }
    
    
    @Override
    public String toString(){
        return this.getChildname();
    }
}
