package Assignment28;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

       System.out.println("\nARRAYLIST\n") ;

    ArrayList<Student> studentsArr = new ArrayList<>();
    Student student1 = new Student("Ismail Battal", "+19364393033", 200717, 3.8);
    Student student2 = new Student("Ahmed Acar", "+1936423423", 200799, 3.5);
    Student student3 = new Student("Ahmed Acar", "+1936423423", 200799, 3.5);
    studentsArr.add(student1);
    studentsArr.add(student2);
    studentsArr.add(student3);
    System.out.println(studentsArr);
    
      //ArrayList -> Dublicatable, Insertion Order

     System.out.println("\nLINKEDLIST\n") ;    
    LinkedList<Student> studentsLinked = new LinkedList<>();

    studentsLinked.add(student1);
    studentsLinked.add(student2);
    studentsLinked.add(student3);
    System.out.println(studentsLinked);

        //LinkedList-> Dublicatable, Insertion Order
    
        System.out.println("\nHASHSET\n");

    HashSet<Student> studentsHashSet = new HashSet<>();

    studentsHashSet.add(student1);
    studentsHashSet.add(student2);
    studentsHashSet.add(student3);
    System.out.println(studentsHashSet);
        //HashSet-> No Dublicatable, No Insertion Order.
        
        System.out.println("\nTREESET\n");
    TreeSet<Student> studentsTreeSet = new TreeSet<>();
    
    studentsTreeSet.add(student1);
    studentsTreeSet.add(student2);
    studentsTreeSet.add(student3);
    System.out.println(studentsTreeSet);
     //TreeSet-> No Dublicatable. Order by Comparator or Comparable etc..
    

      
    

    


     }


    

}
