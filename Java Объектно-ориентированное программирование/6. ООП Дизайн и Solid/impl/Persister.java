package homework.impl;

import homework.Persisterable;

public class Persister implements Persisterable {
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
