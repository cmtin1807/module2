package ss13.bai_tap_ly_thuyet.controller;

import ss13.bai_tap_ly_thuyet.view.RoleConst;
import ss13.bai_tap_ly_thuyet.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ss13.bai_tap_ly_thuyet.service.Manager.*;

public class Main {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("Nguyen", "Nguyen@gmail.com", RoleConst.ROLE_ADMIN));
        list.add(new User("Nguyen1", "Nguyen1@gmail.com", RoleConst.ROLE_ADMIN));
        list.add(new User("Quyet", "Quyet@gmail.com", RoleConst.ROLE_USER));
        list.add(new User("Cong", "Cong@gmail.com", RoleConst.ROLE_USER));
        ListAdmin(list);
        ListUser(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        searchAndPrint(list, email);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        searchName(list, name);


    }


}
