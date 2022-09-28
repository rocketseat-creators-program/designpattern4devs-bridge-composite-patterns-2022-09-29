package bridge.simpleBackend.services;

import bridge.simpleBackend.dao.UserDao;
import bridge.simpleBackend.model.User;

public class UserMonolith extends UserService {

    public UserMonolith(UserDao userDao) {
        super(userDao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Monolith Architecture");
        dao.save(user);
    }
}
