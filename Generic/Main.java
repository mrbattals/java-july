package Generic;

public class Main {
    public static void main(String[] args) {
       

    Pair <String, String> pair1 = new Pair<>("Ismail","BATTAL");
    Pair <String, Integer> pair2 =  new Pair<>(" Ismail",40);
    Pair <String, Double> pair4 =  new Pair<>("Ismail",40.5);

     
     String fullName = pair1.getKey()+ " " + pair1.getValue();
     double someDouble = pair4.getValue();
     Object a = pair2.getValue() + pair2.getKey();

     System.out.println(a);
     System.out.println(fullName);
     System.out.println(someDouble);

     
     System.out.println(adding(2.5,4.3));


      }

      public static <T extends Number> double adding (T a, T b){

        return a.doubleValue() + b.doubleValue();

      }


      }

        

