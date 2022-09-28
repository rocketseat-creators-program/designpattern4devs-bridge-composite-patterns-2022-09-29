package bridge.simpleBackend.dao;

import bridge.simpleBackend.model.User;

public class UserPythonDao implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("Saving the user using Python language");
    }
}
