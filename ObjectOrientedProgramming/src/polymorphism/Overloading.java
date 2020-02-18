package polymorphism;

/**
 * Created by Sadman on 2/18/2020.
 */
class Knife{
    private String sharpness;
    private int size;

    public Knife(String sharpness) {
        this.sharpness = sharpness;
    }

    // Constructor Overloading
    public Knife(String sharpness, int size) {
        this.sharpness = sharpness;
        this.size = size;
    }

    public void cutting(String things){
        System.out.println("Knife cuts " + things);
    }

    // Method Overloading By changing the data type
    public void cutting(int cuttingLength){
        System.out.println("Knife cuts " + cuttingLength + " centimeter");
    }
    // Method Overloading By changing number of arguments
    public void cutting(String things, int cuttingLength){
        System.out.println("Knife cuts " + things + " with " + cuttingLength + " centimeter");
    }

    public String toString(){
        return getClass().getSimpleName() + " sharpness is " + sharpness + " and size is " + size + " centimeter";
    }
}

public class Overloading {
    public static void main(String[] args){
        Knife knife = new Knife("high", 10);
        knife.toString();
        knife.cutting("vegetables");
        knife.cutting(10);
        knife.cutting("vegetables",10);
    }
}
