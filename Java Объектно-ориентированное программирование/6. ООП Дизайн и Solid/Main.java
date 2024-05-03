package homework;

import homework.impl.Persister;
import homework.impl.ReportUser;
import homework.impl.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        ReportUser report = new ReportUser();
        report.report(user);
        persister.save(user);
    }


}