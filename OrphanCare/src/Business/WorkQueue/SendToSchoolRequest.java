package Business.WorkQueue;

import Business.Child.Child;
import Business.UserAccount.UserAccount;

/**
 * zhb970327
 */
public class SendToSchoolRequest extends WorkRequest {

    private Child child;
    private String comments;
    private DistributionWorkRequest distribution;
    private String childname;

    public SendToSchoolRequest(Child child) {
        super();
        this.child = child;
        this.child.setSchoolStatus("Waiting for respond");
    }

    public String summary() {
        return child.getName() + ", " + child.getSchool() + ", " + child.getSchoolStatus();
    }

    public String childName() {
        return child.getName();
    }

    public String getChildname() {
        return child.getName();
    }

    public void setChildname(String childname) {
        this.childname = childname;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DistributionWorkRequest getDistribution() {
        return distribution;
    }

    public void setDistribution(DistributionWorkRequest distribution) {
        this.distribution = distribution;
    }

    //是否被录取, 如果被录取的话,请修改小孩子的学校. getChild().setSchool(String name)
    public void setChildStatus(boolean t) {
        if (t) {
            child.setSchoolStatus("Enrolled.");
        } else {
            child.setSchoolStatus("Rejected");
        }
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return child.getName(); //To change body of generated methods, choose Tools | Templates.
    }

}
