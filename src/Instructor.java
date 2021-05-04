public class Instructor extends User{

    String courseGiven;

    public Instructor (int id, String firstName, String lastName,String password,String courseGiven){
        super(id, firstName, lastName, password);
        this.courseGiven = courseGiven;
    }

    public String getCourseGiven() {
        return courseGiven;
    }

    public void setCourseGiven(String courseGiven) {
        this.courseGiven = courseGiven;
    }
}
