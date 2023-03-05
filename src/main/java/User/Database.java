package User;

public interface Database {

    void registerNewUser(User user);

    void deleteUser(Long id, String password);

    boolean login(Long id, String password);
}
