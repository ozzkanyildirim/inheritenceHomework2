public class StudentManager {

    public void Add(Student student) {
        System.out.println("Ogrenci eklendi : " + student.getFirstName());
    }

    public void Remove(Student student) {
        System.out.println("Ogrenci silindi : " + student.getFirstName());
    }

    public void Update(Student student) {
        System.out.println("Ogrenci guncellendi : " + student.getFirstName());
    }
}
