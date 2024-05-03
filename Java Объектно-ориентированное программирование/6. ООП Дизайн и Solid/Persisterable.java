package homework;

import homework.impl.User;

public interface Persisterable {
    void save(User user);
}
