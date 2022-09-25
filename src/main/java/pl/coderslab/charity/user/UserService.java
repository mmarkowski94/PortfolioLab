package pl.coderslab.charity.user;

public interface UserService {

       void save(User user);
       boolean existsByEmail(String email);
       User findByEmail(String email);
}
