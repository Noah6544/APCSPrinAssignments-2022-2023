package triangleclassgotmefused;

public class TriangleClassgotmefused {

    //Step 1: define attributes
    
    double base;
    double height;
    int count;
    
    //Step 2: Default constructor
    
    public TriangleClassgotmefused(){
        base = 15;
        height = 4;
        count = 324;
    }
    
    //Step 3: Parameter constructor
    public TriangleClassgotmefused(double base, double height, int count){
        this.base = base;
        this.height = height;
        this.count = count;
    }
    //Step 4: Accessors (Getters)
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public int getCount(){
        return count;
    }
    //Step 5: Mutators
    
    public double setBase(double base){
        this.base = base;
    }
    public double setHeight(double height){
        this.height = height;
    }
    public int setCount(int Count){
        this.count = Count;
    }
    
    public void CalculateArea(double side){
        System.out.println("The square's area is: " + 0.5*base*height);
    }
    
    public String toString(){
        return "Base: " + base + 
                "\nHeight: " + height+
               "\nCount: " + count;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
