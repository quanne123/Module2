package view;

import controller.FacilityController;
import model.facility.Facility;
import model.facility.Room;
import model.facility.Villa;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private final FuramaVIew furamaVIew = new FuramaVIew();
    private final FacilityController facilityController = new FacilityController();
    private final Scanner sc = new Scanner(System.in);
    public void displayFacilityMenu(){
        do {
            System.out.println("1: Display list facility");
            System.out.println("2: Add new Facility");
            System.out.println("3: Display list facility maintenance");
            System.out.println("4: Return main menu");
            System.out.println("Enter your option");
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1 :
                    this.facilityController.displayFacility();
                    break;
                case 2:
                    do {
                        System.out.println("1: Add villa");
                        System.out.println("2: Add Room");
                        System.out.println("3: Back to menu");
                        System.out.println("ENter your choice");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("Enter name Villa");
                                String nameVilla = sc.nextLine();
                                System.out.println("Enter area");
                                int area = Integer.parseInt(sc.nextLine());
                                System.out.println("Enter cost rent");
                                int costRent = Integer.parseInt(sc.nextLine());
                                System.out.println("Enter number of tenants");
                                int numberOfTenants = Integer.parseInt(sc.nextLine());
                                System.out.println("Enter type rent");
                                String typeRent = sc.nextLine();
                                System.out.println("Enter standard Room");
                                String standardRoom = sc.nextLine();
                                System.out.println("Enter area Pool");
                                int areaPool = Integer.parseInt(sc.nextLine());
                                System.out.println("Enter floor");
                                int floor = Integer.parseInt(sc.nextLine());
                                Villa villa = new Villa(nameVilla,area,costRent,numberOfTenants,typeRent,standardRoom,areaPool,floor);
                                facilityController.addVilla(villa);
                                break;
                            case  2 :
                                System.out.println("Enter name Room");
                                String nameRoom = sc.nextLine();

                                System.out.println("Enter area");
                                int areaRoom = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter cost rent");
                                int costRentR = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter number of tenants");
                                int numberOfTenantsRoom = Integer.parseInt(sc.nextLine());

                                System.out.println("Enter type rent");
                                String typeRentRoom = sc.nextLine();

                                System.out.println("Enter Free Service");
                                String freeService = sc.nextLine();

                                Room room = new Room(nameRoom,areaRoom,costRentR,numberOfTenantsRoom,typeRentRoom,freeService);
                                this.facilityController.addRoom(room);
                                break;
                            case 3 :
                                this.displayFacilityMenu();
                                break;
                        }
                    }while (true);

                case 3:
                    this.facilityController.displayMaintenance();
                    break;
                case 4 :
                    furamaVIew.displayMainMenu();
            }
        }while (true);

    }
}
