package view;

import common.RegularException;
import common.Validate;
import controller.FacilityController;
import model.Facility.Room;
import model.Facility.Villa;

import java.util.Scanner;

public class FacilityView {
    private final Scanner sc = new Scanner(System.in);
    private final FacilityController facilityController = new FacilityController();

    public void displayFacilityMainMenu(){
        do {
            System.out.println("1: Display Facility");
            System.out.println("2: Add new Facility");
            System.out.println("3: display maintenance");
            System.out.println("4: Return Main Menu");
            System.out.println("Enter your Option");
            int opiton = Integer.parseInt(sc.nextLine());

            switch (opiton){

                case 1:
                    this.facilityController.display();
                    break;
                case 2:
                    do {
                        System.out.println("1: Add new Villa");
                        System.out.println("2: Add new Room");
                        System.out.println("3: Return Facility Menu");
                        System.out.println("Enter your choice");
                        int choice = Integer.parseInt(sc.nextLine());
                        String nameServiceV;
                        double areaV;
                        int costV;
                        int numberTenantsV;
                        String typeRentV;
                        String standardV;
                        double areaPoolV;
                        int floor;

                        String nameServiceR;
                        double areaR;
                        int costR;
                        int numberTenantsR;
                        String typeRentR;
                        String freeService;


                        switch (choice){
                            case 1:
                                  do {
                                      try {
                                          System.out.println("Enter NameService Villa");
                                          nameServiceV = sc.nextLine();
                                          Validate.setNameServiceRegex(nameServiceV);
                                          break;

                                      } catch (RegularException e) {
                                          e.printStackTrace();
                                      }
                                  }while (true);

                                  do {
                                      try {
                                          System.out.println("Enter area Villa");
                                          areaV = Double.parseDouble(sc.nextLine());
                                          Validate.setAreaServiceRegex(areaV);
                                          break;
                                      }catch (RegularException e){
                                          e.printStackTrace();
                                      }

                                  }while (true);
//
                                do {
                                    try {
                                    System.out.println("Enter cost Villa");
                                    costV = Integer.parseInt(sc.nextLine());

                                        Validate.setCostRentRegex(costV);
                                    } catch (RegularException e) {
                                        throw new RuntimeException(e);
                                    }
                                    break;
                                }while (true);

                                do {
                                    try {
                                    System.out.println("Enter number Tenants");
                                    numberTenantsV = Integer.parseInt(sc.nextLine());
                                    Validate.setNumberTenantsRegex(numberTenantsV);
                                        break;
                                    } catch (RegularException e) {
                                        throw new RuntimeException(e);
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter TypeRent");
                                        typeRentV = sc.nextLine();
                                        Validate.setTypeRentRegex(typeRentV);
                                        break;
                                    }catch (RegularException e){
                                        e.printStackTrace();
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter standard");
                                        standardV = sc.nextLine();
                                        Validate.setStandardRegex(standardV);
                                        break;
                                    }catch (RegularException e){
                                        e.printStackTrace();
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter areaPool");
                                        areaPoolV = Double.parseDouble(sc.nextLine());
                                        Validate.setAreaServiceRegex(areaPoolV);
                                        break;
                                    }catch (RegularException e){
                                        e.printStackTrace();
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter floor");
                                        floor = Integer.parseInt(sc.nextLine());
                                        Validate.setFloorRegex(floor);
                                        break;
                                    }catch (RegularException e){
                                        e.printStackTrace();
                                    }
                                }while (true);

                                this.facilityController.addVilla(new Villa(nameServiceV,areaV,costV,numberTenantsV,typeRentV,standardV,areaPoolV,floor));
                                break;
                            case 2:

                                do {
                                    try {
                                        System.out.println("Enter Name Service");
                                        nameServiceR = sc.nextLine();
                                        Validate.setNameServiceRegex(nameServiceR);
                                        break;
                                    } catch (RegularException e) {
                                        e.printStackTrace();
                                    }

                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter Area Room");
                                        areaR = Double.parseDouble(sc.nextLine());
                                        Validate.setAreaServiceRegex(areaR);
                                        break;
                                    } catch (RegularException e) {
                                        e.printStackTrace();
                                    }

                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter cost Room");
                                        costR = Integer.parseInt(sc.nextLine());
                                        Validate.setCostRentRegex(costR);
                                        break;
                                    } catch (RegularException e) {
                                        e.printStackTrace();
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter number Tenants Room");
                                        numberTenantsR = Integer.parseInt(sc.nextLine());
                                        Validate.setNumberTenantsRegex(numberTenantsR);
                                        break;
                                    } catch (RegularException e) {
                                        e.printStackTrace();
                                    }
                                }while (true);

                                do {
                                    try {
                                        System.out.println("Enter type Rent of Room");
                                        typeRentR = sc.nextLine();
                                        Validate.setTypeRentRegex(typeRentR);
                                        break;
                                    } catch (RegularException e) {
                                        e.printStackTrace();
                                    }
                                }while (true);

                                System.out.println("Enter freeService");
                                freeService = sc.nextLine();

                               this.facilityController.addRoom(new Room(nameServiceR,areaR,costR,numberTenantsR,typeRentR,freeService));
                                break;
                            case 3:
                                FacilityView facilityView = new FacilityView();
                                facilityView.displayFacilityMainMenu();
                                break;

                        }
                    }while (true);

                case 3:
                    this.facilityController.displayMainTenance();
                    break;
                case 4:
                    FuramaView furamaView = new FuramaView();
                    furamaView.displayMainmenu();
            }

        }while (true);
    }
}
