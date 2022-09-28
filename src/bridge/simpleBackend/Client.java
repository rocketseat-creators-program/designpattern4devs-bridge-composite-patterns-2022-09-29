package bridge.simpleBackend;

import bridge.simpleBackend.dao.UserPythonDao;
import bridge.simpleBackend.dao.UserRustDao;
import bridge.simpleBackend.model.User;
import bridge.simpleBackend.services.UserMicroservice;
import bridge.simpleBackend.services.UserMonolith;
import bridge.simpleBackend.services.UserService;

public class Client {

    public static void main(String[] args) {
        User user = new User("user", "user@email.com", "passwd");

        UserService userRestOracleService = new UserMicroservice(new UserPythonDao());
        userRestOracleService.save(user);

        UserService userEJBMongoService = new UserMonolith(new UserRustDao());
        userEJBMongoService.save(user);



    }
}
