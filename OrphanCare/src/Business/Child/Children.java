package Business.Child;

import java.util.ArrayList;

/**
 * 一群小孩
 *
 * @author yuenasu
 */
public class Children {

    private ArrayList<Child> children;

    public Children() {
        this.children = new ArrayList<>();
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    public void add(Child c) {
        children.add(c);
    }
    
    public void remove(Child c){
        children.remove(c);
    }
}
