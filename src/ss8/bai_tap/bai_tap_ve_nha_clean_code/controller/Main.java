package ss8.bai_tap.bai_tap_ve_nha_clean_code.controller;


import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.FactoryStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.OfficeStaff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Shipper;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.model.Staff;
import ss8.bai_tap.bai_tap_ve_nha_clean_code.service.StaffService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert limit of list: ");
        int limit = sc.nextInt();
        StaffService manager = new StaffService(limit);
        Staff staff1 = new OfficeStaff(1, "Nguyen", "0982775131", "Giam doc");
        Staff staff2 = new FactoryStaff(2, "Quyet", "0909000999", "Giam doc", "C04", "Fulltime");
        manager.addStaff(staff1);
        manager.addStaff(staff2);

        while (true) {
            System.out.println("Menu Staff Manager");
            System.out.println("1. Add Staff");
            System.out.println("2. Update Staff");
            System.out.println("3. Remove Staff");
            System.out.println("4. Display Staff");
            System.out.println("0. Exit.");
            System.out.print("Choice Funcition Of You: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean continueAdd = true;
                    while (continueAdd) {
                        System.out.println("1. Office Staff");
                        System.out.println("2. Factory Staff");
                        System.out.println("3. Shipper");
                        System.out.println("0. Exit");
                        System.out.print("Choice Type Of Staff:  ");
                        int choiceAdd = sc.nextInt();
                        switch (choiceAdd) {
                            case 1:
                                System.out.print("ID Staff: ");
                                int idOffice = sc.nextInt();
                                System.out.print("Name Staff: ");
                                String nameOffice = sc.next();
                                System.out.print("Phone Staff: ");
                                String phoneOffice = sc.next();
                                System.out.print("Position Staff: ");
                                String positionOffice = sc.next();
                                sc.nextLine();
                                Staff officeStaff = new OfficeStaff(idOffice, nameOffice, phoneOffice, positionOffice);
                                manager.addStaff(officeStaff);
                                break;

                            case 2:
                                System.out.print("ID Staff: ");
                                int idFactory = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Name Staff: ");
                                String nameFactory = sc.next();
                                System.out.print("Phone Staff: ");
                                String phoneFactory = sc.next();
                                System.out.print("Position Staff: ");
                                String positionFactory = sc.next();
                                System.out.print("ID Factory: ");
                                String idFactoryStaff = sc.next();
                                System.out.print("Type Staff (Fulltime/Parttime): ");
                                String typeFactory = sc.next();
                                sc.nextLine();
                                Staff factoryStaff = new FactoryStaff(idFactory, nameFactory, phoneFactory, positionFactory, idFactoryStaff, typeFactory);
                                manager.addStaff(factoryStaff);
                                break;
                            case 3:
                                System.out.print("ID Staff: ");
                                int idShipper = sc.nextInt();
                                System.out.print("Name Staff: ");
                                String nameShipper = sc.next();
                                System.out.print("Phone Staff: ");
                                String phoneShipper = sc.next();
                                System.out.print("Position Staff: ");
                                String positionShipper = sc.next();
                                System.out.print("Type of Vehicle (Motor/Car): ");
                                String typeVehicle = sc.next();
                                sc.nextLine();
                                Staff shipper = new Shipper(idShipper, nameShipper, phoneShipper, positionShipper, typeVehicle);
                                manager.addStaff(shipper);
                                break;
                            case 0:
                                continueAdd = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please make a different selection.");

                        }
                    }
                    break;

                case 2:
                    boolean continueUpdate = true;
                    while (continueUpdate) {
                        System.out.println("1. Update");
                        System.out.println("0. Exit");
                        System.out.print("Choice Funcition Of You: ");
                        int choiceUpdate = sc.nextInt();
                        switch (choiceUpdate) {
                            case 1:
                                System.out.print("ID Staff Update: ");
                                int idUpdate = sc.nextInt();
                                manager.updateStaff(idUpdate);
                                break;
                            case 0:
                                continueUpdate = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please make a different selection.");
                        }
                    }
                    break;
                case 3:
                    boolean continueRemove = true;
                    while (continueRemove) {
                        System.out.println("1. Remove");
                        System.out.println("0. Exit");
                        System.out.print("Choice Funcition Of You: ");
                        int choiceRemove = sc.nextInt();
                        switch (choiceRemove) {
                            case 1:
                                System.out.print("ID Staff Remove: ");
                                int idRemove = sc.nextInt();
                                manager.deleteStaff(idRemove);
                                break;
                            case 0:
                                continueRemove = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please make a different selection.");
                        }
                    }
                    break;
                case 4:
                    boolean continueDisplay = true;
                    while (continueDisplay) {
                        System.out.println("1. Display All Staff");
                        System.out.println("2. Display Type Of Staff");
                        System.out.println("0. Exit");
                        System.out.print("Choice Funcition Of You: ");
                        int choiceDisplay = sc.nextInt();
                        switch (choiceDisplay) {
                            case 1:
                                manager.displayStaff();
                                break;
                            case 2:
                                boolean continueTypeDisplay = true;
                                while (continueTypeDisplay) {
                                    System.out.println("1. Display Office Staff");
                                    System.out.println("2. Display Factory Staff");
                                    System.out.println("3. Display Shipper");
                                    System.out.println("0. Exit");
                                    System.out.print("Choice Funcition Of You: ");
                                    int choiceTypeDisplay = sc.nextInt();
                                    switch (choiceTypeDisplay) {
                                        case 1:
                                            manager.displayOfficeStaff();
                                            break;
                                        case 2:
                                            manager.displayFactoryStaff();
                                            break;
                                        case 3:
                                            manager.displayShipper();
                                        case 0:
                                            continueTypeDisplay = false;
                                            break;
                                        default:
                                            System.out.println("Invalid choice. Please make a different selection.");
                                    }
                                }
                                break;
                            case 0:
                                continueDisplay = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please make a different selection.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("You Had Exit.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please make a different selection.");
                    break;
            }
        }
    }
}
