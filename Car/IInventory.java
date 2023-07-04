package Car;

public interface IInventory {
    
    void searchCarsByName(String name);
    void viewCars();
    void soldCar(Vehicle newCar);
    void addCar(Vehicle newCar);
}
