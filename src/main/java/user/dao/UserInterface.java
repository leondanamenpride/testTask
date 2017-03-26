package user.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import user.model.User;
public interface UserInterface extends JpaRepository<User,Integer> {


    User findByUsername(String username);
}
