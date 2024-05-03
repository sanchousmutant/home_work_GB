package notebook.util;

import notebook.model.User;

public class UserValidator {
    public User validate(User user){
        String name = user.getFirstName().replaceFirst(" ","").trim();
        String lastName = user.getLastName().replaceFirst(" ","").trim();
        user.setFirstName(name);
        user.setLastName(lastName);
        return user;
    }
}
