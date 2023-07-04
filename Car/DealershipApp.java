package Car;

import java.util.Scanner;

public class DealershipApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
    Cars car1 = new Cars("BMW","5 Series","Monaco Blue",2007, 3.5);
    Cars car2 = new Cars("Mercedes","E class","White",2010, 4.2);
    Cars car3 = new Cars("Audi","A6","Black",2013, 4.6);
    Cars car4 = new Cars("Toyota","Avalon","Blue",2010, 6.5);
    Cars car5 = new Cars("Honda","Civic","Gray",2008, 8.6);

    Trucks truck1 = new Trucks("Ford","F150","Gray",2008, 2040);


      
    Inventory inventory = new Inventory();

    inventory.addCar(car1);
    inventory.addCar(car2);
    inventory.addCar(car3);
    inventory.addCar(car4);
    inventory.addCar(car5);
    inventory.addCar(truck1);
    inventory.soldCar(car2);
    inventory.viewCars();

    System.out.println("Please enter the car name that you are looking for:");
    String name = scan.next();
   
    inventory.searchCarsByName(name);

    scan.close();

        }


}
