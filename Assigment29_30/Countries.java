package Assigment29_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countries{
    public static void main(String[] args) {

//29. Array to Collection

String[] countries = {"France", "Italy", "Germany"};
List<String> countriesList = Arrays.asList(countries);
System.out.println(countriesList);

//30. from Two ArrayList to Single ArrayList
ArrayList<String> countriesEurope = new ArrayList<>();
countriesEurope.add("France");
countriesEurope.add("Italy");
countriesEurope.add("Germany");

ArrayList<String> countriesNorthAmerica = new ArrayList<>();
countriesNorthAmerica.add("Canada");
countriesNorthAmerica.add("US");
countriesEurope.addAll(countriesNorthAmerica);

System.out.println("Europe and North America Countries: "+ countriesEurope);


 }
}