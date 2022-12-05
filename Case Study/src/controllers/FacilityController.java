package controllers;

import model.Room;
import model.Villa;
import service.IFacilityIService;
import service.impl.FacilityService;

import java.util.*;

public class FacilityController {
    public static void facilityManagement() {
        IFacilityIService iFacilityIService = new FacilityService();

        int choice;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("1: Display list facility");
            System.out.println("2: Add new Facility");
            System.out.println("3: Display list facility maintenance");
            System.out.println("4: Return main menu");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    iFacilityIService.displayFacility();
                    break;


                case 2:
                    do {


                        System.out.println("1.Add new Villa");
                        System.out.println("2.Add new Room");
                        System.out.println("3.Back to menu");
                        int option = Integer.parseInt(sc.nextLine());

                        switch (option) {
                            case 1:
                                System.out.println("Enter Name Villa");;
                                String nameVilla = sc.nextLine();

                                System.out.println("Enter area");
                                int area = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter costRent");
                                int costRent = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter number Of Tenants");
                                int numberOfTenants = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter rentalType ");
                                String rentalType = sc.nextLine();

                                System.out.println("Enter standard Room");
                                String standard = sc.nextLine();

                                System.out.println("Enter area Pool");
                                int areaPool = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter floor");
                                int floor = Integer.parseInt(sc.nextLine());

                                Villa  villa= new Villa(nameVilla,area,costRent,numberOfTenants,rentalType,standard,areaPool,floor);
                                iFacilityIService.addVilla(villa);

                                break;
                            case 2:

                                System.out.println("Enter Name Room");;
                                String nameRoom = sc.nextLine();

                                System.out.println("Enter area");
                                int areaRoom = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter costRent");
                                int costRentRoom = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter number Of Tenants");
                                int numberOfTenantsRoom = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter rentalType ");
                                String rentalTypeRoom = sc.nextLine();

                                System.out.println("Enter freeService");
                                String freeService = sc.nextLine();

                                Room room =new Room(nameRoom,areaRoom,costRentRoom,numberOfTenantsRoom,rentalTypeRoom,freeService);
                                iFacilityIService.addRoom(room);



                                break;
                            case 3:
                                FacilityController.facilityManagement();
                                break;
                        }
                    } while (true);
                case 3:
                    iFacilityIService.displayListMaintenance();
                    break;
            }

        } while (true);
    }
}