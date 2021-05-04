public class UserManager {

    public void Add(User user) {
        System.out.println("Bilgi eklendi : " + user.getFirstName());

    }

    public void Remove(User user) {
        System.out.println("Bilgileri silindi : " + user.getFirstName());

    }

    public void Update(User user) {
        System.out.println("Bilgileri güncellendi : " + user.getFirstName() );
    }
}
