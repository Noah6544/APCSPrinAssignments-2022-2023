package trackinggrades;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    String name;
    int test1;
    int test2;    
        
    public Student(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void inputGrades(){
        System.out.println("Enter Test Grade #1 for " + this.name +" : ");
        this.test1 = input.nextInt();
        System.out.println("Enter Test Grade #2 for " + this.name +" : ");
        this.test2 = input.nextInt();
    }
    
    public int getAverage(){
        return (this.test1+this.test2)/2;
    }
    
    public String toString(){
        return this.name + "'s Grades:\nTest 1: " + this.test1 + "\nTest 2: " + this.test2;
    }
}
