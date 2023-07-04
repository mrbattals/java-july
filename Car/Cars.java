package Car;

public class Cars extends Vehicle{

    private int zeroToHundread;

    public Cars(String make, String model, String color, int year, double zeroToHundread){
        super(make, model, color, year);
     
    }



    public int getZeroToHundread() {
        return this.zeroToHundread;
    }

    public void setZeroToHundread(int zeroToHundread) {
        this.zeroToHundread = zeroToHundread;
    }







}
