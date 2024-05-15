package squareclassimconfusedngl;


public class SquareclassImconfusedngl {

    //Step 1: define attributes
    
    double side;
    int count;
    
    //Step 2: Default constructor
    
    public SquareclassImconfusedngl(){
        side = 15;
        count = 4;
    }
    
    //Step 3: Parameter constructor
    public SquareclassImconfusedngl(double side, int count){
        this.side = side;
        this.count = count;
    }
    //Step 4: Accessors (Getters)
    public double getside(){
        return side;
    }
    
    public int getCount(){
        return count;
    }
    //Step 5: Mutators
    
    public double setSide(double side){
        this.side = side;
    }
    public int setCount(int count){
        this.int = int;
    }
    
    public void CalculateArea(double side){
        System.out.println("The square's area is: " + side*2);
    }
    
    public String toString(){
        return "Side Length: " + side + 
               "\nCount: " + count;
    }
    public static void main(String[] args) {
    }
    
}
