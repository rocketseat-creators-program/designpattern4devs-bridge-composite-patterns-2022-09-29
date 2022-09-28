package bridge.simpleBackend.dao;

import bridge.simpleBackend.model.User;

public class UserRustDao implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("Saving the user using Rust as language");
    }
}
