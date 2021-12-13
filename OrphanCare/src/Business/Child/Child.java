package Business.Child;

/**
 * 小孩
 *
 * @author yuenasu
 */
public class Child {

    private String name;
    private int id;
//    private static int count = 1035;
    private String gender;
    private String birth;
    private int height;
    private int weight;
    private String state;
    private String comment;
    private boolean isAble;
    private String Status;    //状态，e.g. in Gym
    private String schoolStatus; //无，等待，被录，或者被拒
    private String school;    //学校名字
    private String fitness;
    private String fitnessStatus;
    private String Rehabilitation;
    private String FitnessItem;

    public Child() {
//        id = count;
//        count++;
        id = 0;
        school = "None";
        fitness = "None";
        fitnessStatus = "None";
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFitness() {
        return fitness;
    }

    public void setFitness(String fitness) {
        this.fitness = fitness;
    }

    public String getFitnessStatus() {
        return fitnessStatus;
    }

    public void setFitnessStatus(String fitnessStatus) {
        this.fitnessStatus = fitnessStatus;
    }

    public String getName() {
        return name;
    }

    public String getSchoolStatus() {
        return schoolStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean getAble() {
        return isAble;
    }

    public void setAble(boolean able) {
        isAble = able;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setSchoolStatus(String schoolStatus) {
        this.schoolStatus = schoolStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getRehabilitation() {
        return Rehabilitation;
    }

    public void setRehabilitation(String Rehabilitation) {
        this.Rehabilitation = Rehabilitation;
    }

    public String getFitnessItem() {
        return FitnessItem;
    }

    public void setFitnessItem(String FitnessItem) {
        this.FitnessItem = FitnessItem;
    }

    @Override
    public String toString() {
//        return "Name: " + name + ", Gender: " + gender
//                + ", ID: " + id + ", Status: " + Status + "  " + schoolStatus;
        return name;
    }

}
