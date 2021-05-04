public class Main {


    public static void main(String[] args) {

        Student student = new Student(1,"Ozkan","Yıldırım","5454","JAVA");
        StudentManager studentManager = new StudentManager();
        studentManager.Add(student);
        studentManager.Remove(student);
        studentManager.Update(student);

        System.out.println("#############################");

        Instructor instructor = new Instructor(2,"Engin", "Demiroğ","0000","JAVA");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.Add(instructor);
        instructorManager.Remove(instructor);
        instructorManager.Update(instructor);


    }


}
