package arealabassignment;
 
import java.util.Scanner;

public class AreaLabAssignment {
    
    private static Scanner input = new Scanner(System.in);
    
    public static int triangle(){
        System.out.println("\nCalculate Triangle Area");
        System.out.print("Enter Base: ");
        int base = input.nextInt();
        System.out.print("Enter Height: ");
        int height = input.nextInt();
        int area = (int)(0.5 * base * height);
        System.out.println("The area of this triangle is: " + area);
        return area;
    }


    public static int parallelogram(){
        System.out.println("\nCalculate Parallelogram Area");
        System.out.print("Enter Width: ");
        int Width = input.nextInt();
        System.out.print("Enter Height: ");
        int Height = input.nextInt();
        int area = (int)(Width * Height);
        System.out.println("The area of this Rectangle is: " + area);
        return area;
    }



    public static int circle(){
        System.out.println("\nCalculate Circle Area");
        System.out.print("Enter Radius: ");
        int Radius = input.nextInt();
        int area = (int)((Radius * Radius)*3.14159265);
        System.out.println("The area of this Circle is: " + area);
        return area;
    }

    public static int square(int length){
        System.out.println("\nCalculate Square Area");

        int area = (int)(length*length);
        System.out.println("The area of this Square is: " + area);
        return area;


    }
    public static int BigSquareSubtractLittle(){
        System.out.println("\nCalculate Big Square Area - Small Square");
        System.out.println("Enter Length of BIG square: ");
        int LengthBigSquare = input.nextInt();
        int BigSquare = square(LengthBigSquare);
        System.out.println("Enter Length of SMALL square: ");
        int LengthSmallSquare = input.nextInt();
        int SmallSquare = square(LengthSmallSquare);
        int area = BigSquare - SmallSquare;
        System.out.println("The area of the Squares Subtracter by each other is: " + area);
        return area;


 }
    public static void main(String[] args) {
        String clean = "\n----------------------------------\n";
        boolean istrue = true;
                int surfaceArea = 0;
                System.out.println(clean + "First Triangle" + clean);
                surfaceArea += triangle();
                System.out.println(clean + "Second Triangle" + clean);
                surfaceArea += triangle();  
                System.out.println(clean + "Parallelogram" + clean);
                surfaceArea += parallelogram();
                System.out.println(clean + "First Circle" + clean);
                surfaceArea += circle();
                System.out.println(clean + "Second Circle" + clean);
                surfaceArea += circle();
                System.out.println(clean + "Third Circle" + clean);
                surfaceArea += circle();
                System.out.println(clean + "Big Square - Little Square" + clean);
                surfaceArea += BigSquareSubtractLittle();
                //TODO: add calls to other methods for each of the shapes needed
                System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
                
            }
                
           
        
   
   
  
  
    }
    
