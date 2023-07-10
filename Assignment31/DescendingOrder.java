package Assignment31;

import java.util.TreeSet;

public class DescendingOrder {
    public static void main(String[] args) {

        // String List

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("AA");
        treeSet.add("BB");
        
        System.out.println("TreeSet" + treeSet);
        TreeSet<String> treeSetSort = (TreeSet<String>)treeSet.descendingSet();
        System.out.println("Descending order" + treeSetSort);

        // Student List

        

          TreeSet<Student> students = new TreeSet<>(new Student());
        Student student1 = new Student("Ismail Battal", "+19364393033", 200717, 3.8);
        Student student2 = new Student("Ahmed Acar", "+1936423423", 200799, 3.5);
        Student student3 = new Student("Alex Suzan", "+1936423423", 200799, 4.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        System.out.println(students);
        
     }
  }
    

