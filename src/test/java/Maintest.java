import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Maintest {
    @Test
    public void test(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("password"));
    }
}
