package user.service;

import dvd.dao.DvdInterface;
import org.springframework.beans.factory.annotation.Autowired;
import user.dao.UserInterface;
import user.model.User;
//we

public class UserServiceImplement implements UserService {

    @Autowired
    private UserInterface userInterface;

    @Autowired
    private DvdInterface dvdInterface;

    @Override
    public void save(User user) {
        user.setUserPassword(user.getUserPassword());
        userInterface.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userInterface.findByUsername(username);
    }
}
