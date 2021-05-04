public class InstructorManager {


    public void Add(Instructor instructor) {
        System.out.println("Eğitmen eklendi : " + instructor.getFirstName());
    }

    public void Remove(Instructor instructor) {
        System.out.println("Eğitmen silindi : " + instructor.getFirstName());

    }

    public void Update(Instructor instructor) {
        System.out.println("Eğitmen güncellendi : " + instructor.getFirstName());
    }
}
