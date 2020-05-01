# ফ্যাক্টরি মেথড প্যাটার্ন (Factory Method Pattern)                    
ফ্যাক্টরি মেথড  হল ক্রিয়েশনাল ডিজাইন প্যাটার্ন যেটা এমন একটা ইন্টারফেস থাকে superclass এ অবজেক্ট তৈরি করার জন্যে কিন্তু subclass এ অবজেক্ট টাইপ পরিবর্তন করা যায় প্রয়োজন অনুসারে।             

**উদাহরন**                    
১. java.util.Calendar ক্লাস দুইটি বিল্ডার প্যাটার্ন ফলো করে তৈরি করা।                                      

**সমস্যা**         


**সমাধান**                                     

**ইমপ্লিমেন্টেশন**                

```
public abstract class Car {

    public Car(CarType model) {

    }

    public Car(CarType luxury, Location location) {
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private CarType model = null;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
```

```
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            default:
                // throw some exception
                break;
        }
        return car;
    }
}
```

```
public enum CarType {
    SMALL, SEDAN, LUXURY
}
```

```
public class LuxuryCar extends Car {

    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
```

```
public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }
}
```

```
public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
```

```
public class TestFactory {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
```

**সুবিধা - অসুবিধা**              
১. এই প্যাটার্ন ব্যবহার করলে creator এবং ক্লাসগুলো loose coupling হয়।                           
২. এই প্যাটার্নের ইমপ্লিমেন্টাশন একটু জটিল ধরনের হয় যদি আমাদের অনেক ধরনের অবজেক্ট হয়।                      
