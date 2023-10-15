import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.User;
import tdd.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserTest {

    UserRepository repository = new UserRepository();
    User user = new User("Anton", "123");

    @BeforeEach
    void setUp () {
        repository.addUser(user);
    }
    @Test
    void userAddUserTesting() {
        User user1 = new User("Ben", "qwerty");
        repository.addUser(user1);
        assertThat(repository.findByName("Ben")).isEqualTo(user1);
    }
    @Test
    void userFindUserByNameNullTesting() {
        assertThat(repository.findByName("Ben")).isEqualTo(null);
    }

    @Test
    void userFindUserByNameTesting() {
        assertThat(repository.findByName("Anton")).isEqualTo(user);
    }
    @Test
    void authenticateValidTesting() {
        assertTrue(user.authenticate("Anton", "123456"));
    }
    @Test
    void authenticateInvalidTesting() {
        assertFalse(user.authenticate("%", "123456"));
    }

}
