package tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data;

    public UserRepository() {
        this.data = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!data.contains(user) || user.isAuthenticate) {
            data.add(user);
        }
    }

    public User findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return user;
            }
        }
        return null;
    }

}