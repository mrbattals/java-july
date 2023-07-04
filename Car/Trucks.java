package Car;

public class Trucks extends Vehicle{
    
    private double heightMm;
         public Trucks(String make, String model, String color, int year, double heightMm) {
         super(make, model, color, year);
    }

    public double getHeight() {
        return this.heightMm;
    }

    public void setHeight(double heightMm) {
        this.heightMm = heightMm;
    }


}
    
