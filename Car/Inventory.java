package Car;

import java.util.ArrayList;

public class Inventory implements IInventory{

    private ArrayList<Vehicle> vehicles ;

    public Inventory(){
        vehicles = new ArrayList<>();
    }

    public void addCar(Vehicle newCar){
        
       this.vehicles.add(newCar);

    }

    public void soldCar(Vehicle newCar){

        this.vehicles.remove(newCar);
        
    
}
    public void viewCars(){

      for(int i=0; i<vehicles .size();i++){
       System.out.println(vehicles.get(i));
      }
    
}
    public void searchCarsByName(String name){

         for(int i=0; i<this.vehicles.size();i++){
            if(this.vehicles.get(i).getMake().contains(name)){
             System.out.println("Here is the " + name + " vehicles avaliable in stock");
             System.out.println(this.vehicles.get(i));
            }
             else{
       
        System.out.println("Unfortunately we dont have any" + name + " left"+ 
        " Here are what we have in stock currently.");
         viewCars();
         }
       }
            
       }

    


               }

      

        
        
