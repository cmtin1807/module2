package ss13.bai_tap_ly_thuyet.service;

import ss13.bai_tap_ly_thuyet.model.User;
import ss13.bai_tap_ly_thuyet.view.RoleConst;

import java.util.List;

public class Manager {
    public static void searchName(List<User> list, String name) {
        boolean seachName = false;
        for (User user : list) {
            String lowerName = user.getName().toLowerCase();
            String[] word = lowerName.split("");
            for (int i = 0; i < word.length; i++ ){
                if (word[i].equals(name)){
                    seachName = true;
                    System.out.println(user);
                    break;
                }
            }
        }
        if (!seachName) {
            System.out.println("Name not found");
        }
    }

    public static void searchAndPrint(List<User> list, String email) {
        boolean flag = false;
        for (User user : list) {
            if (user.getEmail().equals(email)) {
                System.out.println(user.toString());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Email not found");
        }
    }

    public static void ListAdmin(List<User> list) {
        int demAdmin = 0;
        for (User user : list) {
            if (user.getRole() == RoleConst.ROLE_ADMIN) {
                demAdmin++;
                System.out.println(user);
            }
        }
        System.out.println(demAdmin);
    }
    public static void ListUser(List<User> list) {
        int demUser = 0;
        for (User user : list) {
            if (user.getRole() == RoleConst.ROLE_USER) {
                demUser++;
                System.out.println(user);
            }
        }
        System.out.println(demUser);
    }
}
