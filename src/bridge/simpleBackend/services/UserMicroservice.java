package bridge.simpleBackend.services;

import bridge.simpleBackend.dao.UserDao;
import bridge.simpleBackend.model.User;

public class UserMicroservice extends UserService {

    public UserMicroservice(UserDao userDao) {
        super(userDao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Microservice Architecture");
        dao.save(user);
    }
}
