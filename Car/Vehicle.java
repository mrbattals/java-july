package Car;

public class Vehicle{
    
    private String make, model, color;
    private int year;

    

    public Vehicle(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    
    @Override
    public String toString() {
        return "{" +
            " make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", color='" + getColor() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
}
