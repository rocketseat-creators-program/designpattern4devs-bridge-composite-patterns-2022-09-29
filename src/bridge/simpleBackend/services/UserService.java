package bridge.simpleBackend.services;

import bridge.simpleBackend.dao.UserDao;
import bridge.simpleBackend.model.User;

public abstract class UserService {

    protected UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
