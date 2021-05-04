public class Student extends User{

    String courseTaken;

    public Student(int id, String firstName, String lastName,String password,String courseTaken){
        super(id, firstName, lastName, password);
        this.courseTaken = courseTaken;

    }

    public String getCourse() {
        return courseTaken;
    }

    public void setCourse(String courseTaken) {
        this.courseTaken = courseTaken;
    }
}

