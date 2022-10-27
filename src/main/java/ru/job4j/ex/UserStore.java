package ru.job4j.ex;

import java.util.Arrays;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        if (!(Arrays.asList(users).contains(login))) {
            throw new UserNotFoundException("User cold not found");
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!(user.isValid()) || user.getUsername().length() < 3) {
            throw new UserInvalidException("User invalid");
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException n) {
            n.printStackTrace();
        }

    }
}
