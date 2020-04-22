# প্রোটোটাইপ প্যাটার্ন  (Prototype Pattern)               
প্রোটোটাইপ প্যাটার্ন হল ক্রিয়েশনাল ডিজাইন প্যাটার্ন যেটা অলরেডি তৈরি আছে এমন অবজেক্টকে কপি করে উক্ত অবজেক্টের ক্লাসের উপর নির্ভর করা ছাড়াই।   

**উদাহরন**                    
যখন আমরা ডাটাবেজ থেকে পড়ে এনে ডাটা কোন অবজেক্টে রাখি এবং এটা যদি আমাদের বার বার পরিবর্তন করার দরকার হয়। তাহলে বার বার এটা তৈরি করা ভাল প্রাকটিস না। এইক্ষেত্রে আমরা একবার অবজেক্ট তৈরি করে সেটাকে কপি বা ক্লোন করে বিভিন্নভাবে ব্যবহার করতে পারি।  

**সমস্যা**         
* যদি আমাদের কোন অবজেক্টের একটা কপি দরকার হয়। তাহলে প্রথমে আমাদের ওই ক্লাসের নতুন একটা অবজেক্ট তৈরি করতে হবে। তারপর অবজেক্টের ভ্যালু গুলো কপি করতে হবে। কিন্তু এই ক্ষেত্রে সমস্যা হল অবজেক্টের কোন ফিল্ড যদি private হয় তাহলে সেটা কপি করা সম্ভব হবে না।                                     
* কিছু কিছু ক্ষেত্রে আমাদের কাছে শুধু ক্লাসের interface জানা থাকে কিন্তু ক্লাসের প্যারামিটার গুলো আমাদের জানা থাকে না। সেই ক্ষেত্রে আমাদের অবজেক্টের ফিল্ড গুলো জানা ও সম্ভব হবে না।                           
     
**সমাধান**                                     
* প্রোটোটাইপ ক্লাস তৈরির জন্য আমাদের Cloneable ইন্টারফেসকে implement করতে হবে। তারপর clone() মেথডকে ওভাররাইট করতে হবে। clone() মেথডের অবজেক্ট তৈরির কোড লিখতে হবে।                                       
* যখন কোন অবজেক্টের দরকার হয় তখন clone() মেথড কল করলে অবজেক্ট তৈরি হয়ে যায়, কোন ধরনের ক্লাসের সাথে সম্পর্ক ছাড়াই। 

**ইমপ্লিমেন্টেশন**                

```prototype
public interface Prototype extends Cloneable {
    public Prototype clone() throws CloneNotSupportedException;
}
```

```movie
public class Movie implements Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie Object.........");
        return (Movie)super.clone();
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
```

```album
public class Album implements Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album Object.........");
        return (Album)super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}
```

```show
public class Show implements Prototype{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show Object.........");
        return (Show)super.clone();
    }

    @Override
    public String toString() {
        return "Show";
    }
}
```

```prototypefactory
public class PrototypeFactory {
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }

    private  static Map<String, Prototype> prototypes = new HashMap<String, Prototype>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }
    public static Prototype getInstance(final String s) throws CloneNotSupportedException{
        return ((Prototype) prototypes.get(s)).clone();
    }
}
```

```
public class TestPrototype {
    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
            System.out.println(showPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
```


**সুবিধা - অসুবিধা**              
* এটাকে সুবিধামত ক্লোন করা যায় ক্লাসের সাথে সম্পর্ক ছাড়াই।                            
* কোন অবজেক্ট জটিল হলেও সেটা সহজেই তৈরি করা যায়। 