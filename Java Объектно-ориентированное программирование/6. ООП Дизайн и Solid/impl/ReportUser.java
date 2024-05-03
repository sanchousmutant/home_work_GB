package homework.impl;

import homework.Reportable;

public class ReportUser implements Reportable {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
