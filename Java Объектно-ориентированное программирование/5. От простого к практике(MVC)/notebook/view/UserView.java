package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;

import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Введите команду(list - список команд): ").toUpperCase();
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case LIST:
                    System.out.println(getListCommands());
                    break;
                case DELETE:
                    String userId = prompt("Идентификатор пользователя: ").toUpperCase();
                    userController.deleteUser(userId);
                    break;
                case READ_ALL:
                    System.out.println(userController.readAll());
                    break;
                case CREATE:
                    User u = createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    userId = prompt("Идентификатор пользователя: ").toUpperCase();
                    try {
                        User user = userController.readUser(Long.parseLong(userId));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    userId = prompt("Enter user id: ").toUpperCase();
                    userController.updateUser(userId, createUser());
            }
        }
    }
    private String getListCommands(){
        return String.format("Список команд:%n" +
                "create - создать пользователя%n" +
                "read - получить пользователя по id%n" +
                "update - обновить информацию по id%n" +
                "delete - удалить по id%n" +
                "read_all - все пользователи%n" +
                "list - список команд%n" +
                "exit - выход%n"
        );
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }
}
