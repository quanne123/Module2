package controllers;

import common.exception.UserException;
import common.validate.RegexView;
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
                    iFacilityIService.getFacility();
                    break;


                case 2:
                    do {
                        System.out.println("1.Add new Villa");
                        System.out.println("2.Add new Room");
                        System.out.println("3.Back to menu");
                        int option = Integer.parseInt(sc.nextLine());
                        String nameVilla;
                        int area;
                        int costRent;
                        int numberOfTenants;
                        String rentalType;
                        String standard;
                        int areaPool;
                        int floor;
                        int areaRoom;
                        String freeService;

                        switch (option) {

                            case 1:
                                do {
                                    try {
                                        System.out.println("Enter Name Villa");
                                        nameVilla = sc.nextLine();
                                        RegexView.idVilla(nameVilla);
                                        break;
                                    }catch (UserException e ){
                                        System.out.println(e.getMessage());
                                    }
                                }while (true);

                              do {
                                  try {
                                      System.out.println("enter a area");
                                      area = Integer.parseInt(sc.nextLine());
                                      RegexView.area(area);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }

                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter cost Rent");
                                      costRent = Integer.parseInt(sc.nextLine());
                                      RegexView.rentalCost(costRent);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter number of Tenants");
                                      numberOfTenants = Integer.parseInt(sc.nextLine());
                                      RegexView.numberOfTenants(numberOfTenants);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter rental Type");
                                      rentalType = sc.nextLine();
                                      RegexView.rentalType(rentalType);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter standard Room");
                                      standard = sc.nextLine();
                                      RegexView.standardRoom(standard);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter areaPool");
                                      areaPool = Integer.parseInt(sc.nextLine());
                                      RegexView.area(areaPool);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);

                              do {
                                  try {
                                      System.out.println("Enter floor");
                                      floor = Integer.parseInt(sc.nextLine());
                                      RegexView.floor(floor);
                                      break;
                                  }catch (UserException e){
                                      System.out.println(e.getMessage());
                                  }
                              }while (true);
                                Villa villa = new Villa(nameVilla,area,costRent,numberOfTenants,rentalType,standard,area,floor);
                                iFacilityIService.addVilla(villa);
                                break;


//                                Villa villa = new Villa(nameVilla, area, costRent, numberOfTenants, rentalType, standard, areaPool, floor);
//                                iFacilityIService.addVilla(villa);


                            case 2:
                                String nameRoom;
                                do {
                                    try {
                                        System.out.println("Enter Name Room");;
                                        nameRoom = sc.nextLine();
                                        RegexView.idRoom(nameRoom);
                                        break;

                                    }catch (UserException e){
                                        System.out.println(e.getMessage());
                                    }
                                    }while (true);

                                do {
                                    try {
                                        System.out.println("Enter area of Room");
                                        areaRoom = Integer.parseInt(sc.nextLine());
                                        RegexView.area(areaRoom);
                                        break;
                                    }catch (UserException e){
                                        System.out.println(e.getMessage());
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter a cost rent");
                                        costRent = Integer.parseInt(sc.nextLine());
                                        RegexView.rentalCost(costRent);
                                        break;
                                    }catch (UserException e){
                                        System.out.println(e.getMessage());
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter number of Tenants");
                                        numberOfTenants = Integer.parseInt(sc.nextLine());
                                        RegexView.numberOfTenants(numberOfTenants);
                                        break;
                                    }catch (UserException e){
                                        System.out.println(e.getMessage());
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter type rental");
                                        rentalType = sc.nextLine();
                                        RegexView.rentalType(rentalType);
                                        break;
                                    }catch (UserException e){
                                        System.out.println(e.getMessage());
                                    }
                                }while (true);

                                System.out.println("Enter freeService");
                                freeService = sc.nextLine();

                                Room room = new Room(nameRoom,areaRoom,costRent,numberOfTenants,rentalType,freeService);
                                iFacilityIService.addRoom(room);
                                break;


//                                System.out.println("Enter area");
//                                int areaRoom = Integer.parseInt(sc.nextLine());
//
//                                System.out.println("Enter costRent");
//                                int costRentRoom = Integer.parseInt(sc.nextLine());
//
//                                System.out.println("Enter number Of Tenants");
//                                int numberOfTenantsRoom = Integer.parseInt(sc.nextLine());
//
//                                System.out.println("Enter rentalType ");
//                                String rentalTypeRoom = sc.nextLine();
//
//                                System.out.println("Enter freeService");
//                                String freeService = sc.nextLine();
//
//                                Room room =new Room(nameRoom,areaRoom,costRentRoom,numberOfTenantsRoom,rentalTypeRoom,freeService);
//                                iFacilityIService.addRoom(room);

                            case 3:
                                FacilityController.facilityManagement();
                                break;
                        }
                    }while (true);

                case 3:
                    iFacilityIService.getFacilityMaintance();
                    break;
            }

        } while (true);
    }
}