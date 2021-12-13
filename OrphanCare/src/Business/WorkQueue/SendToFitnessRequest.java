package Business.WorkQueue;

import Business.Child.Child;

/**
 * 把小孩送去健身中心
 */
public class SendToFitnessRequest extends WorkRequest {

    private final Child child;

    public SendToFitnessRequest(Child child) {
        super();
        this.child = child;
    }

    public void setChildStatus(String s) {
        child.setStatus(s);
    }

    public void setChildStatus(boolean t) {
        if (t) {
            child.setFitnessStatus("Enrolled");
        } else {
            child.setFitnessStatus("Rejected");
        }
    }

    public Child getChild() {
        return child;
    }

    @Override
    public String toString() {
        return Integer.toString(child.getId());
    }

}
