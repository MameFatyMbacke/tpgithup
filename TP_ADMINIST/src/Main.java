import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.ImpUser;

public class Main {
    public static void main(String[] args) {
        IUser user1 = new ImpUser();
        User u = user1.saisie();
        user1.affichage(u);
    }
}
