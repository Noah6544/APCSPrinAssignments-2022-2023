
package trackinggrades;

import java.util.Scanner;

public class Grades {
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Student student1 = new Student("John Mc. Doe");
        Student student2 = new Student("Sir Timothy");
        student1.inputGrades();
        student2.inputGrades();
        System.out.println("The average for " + student1.name + " is: " + student1.getAverage());
        System.out.println("The average for " + student2.name + " is: " + student2.getAverage());
        student1.toString();
        student2.toString();
        
        
    }
    
    
}
