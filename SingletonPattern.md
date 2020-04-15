# সিঙ্গেলটন প্যাটার্ন  (Singleton Pattern)               
সিঙ্গেলটন প্যাটার্ন হল ক্রিয়েশনাল ডিজাইন প্যাটার্ন যার একটি ক্লাসে(class) শুধুমাত্র একটি instance থাকবে এবং একটা global access point থাকবে ওই instance টা ব্যবহার করার জন্য।             

**উদাহরন**           
* সিঙ্গেলটন প্যাটার্ন  লগিং(logging), ড্রাইভার অবজেক্ট(drivers objects), ক্যাশিং(caching), থ্রেড পুলে(thread pool) ব্যবহৃত হয়।                       
* এটা অন্যান্য ডিজাইন প্যাটার্নে ও ব্যবহার করা হয়। যেমনঃ অ্যাবস্ট্রাক্ট ফ্যাক্টরি(Abstract Factory), বিল্ডার(Builder), প্রোটোটাইপ(Prototype) ইত্যাদি।                            
* এই প্যাটার্ন কোর জাভা ক্লাসে ও ব্যবহৃত হয় যেমনঃ java.lang.Runtime, java.awt.Desktop.         

**সমস্যা**                   
সিঙ্গেলটন প্যাটার্ন  ২ টা সমস্যা সমাধান করে কিন্তু একই সাথে এটি Single Responsibility Principle ভঙ্গ করে।                
১. অনেক সময় আমাদের কিছু কমন ক্লাসের অবজেক্ট বিভিন্ন জায়গায় ব্যবহার করার প্রয়োজন পড়ে। যেমনঃ ডাটাবেজে সংযুক্ত করে এমন কোন ক্লাস। এই ক্লাসের অবজেক্ট আমাদের অনেক জায়গায় ব্যবহার করতে হয়। এখন আমরা যদি চাই একটা অবজেক্ট আমরা সব জায়গায় ব্যবহার করব অর্থাৎ অবজেক্ট একবার তৈরি হলে আর তৈরি করা যাবে না। সুতরাং যেটা তৈরি হয়েছে প্রথমে ওইটাই ব্যবহার করতে হবে। কিন্তু সাধারনভাবে ডিজাইন করা ক্লাস হলে এটা যে কেউ যখন তখন তৈরি পারবে।                                   
২. সিঙ্গেলটন প্যাটার্নের অন্যতম বৈশিস্ট্য global access point অর্থাৎ সিঙ্গেলটন প্যাটার্নের একটা গ্লোবাল ভ্যারিয়েবল থাকবে যার মাধ্যমে সিঙ্গেলটন প্যাটার্নে অ্যাক্সেস করা যায়। কিন্তু সেইক্ষেত্রে এইটা একটু unsafe কারন বাইরে থেকে এই গ্লোবাল ভ্যারিয়েবল বাইরে থেকে যদি কোন কোডের মাধ্যমে পরিবর্তন হয়ে যায়। এইটা গ্লোবাল ভ্যারিয়েবলের পরিবর্তন রোধ করা একটা চ্যালেঞ্জ।                             

**সমাধান**   
১. আমাদের প্রথম সমস্যা সমাধানের জন্য সিঙ্গেলটন ক্লাসের ডিফল্ট কন্সট্রাক্টর private করতে হবে তাহলে বাইরে থেকে new কি ওয়ার্ড ব্যবহার করে অবজেক্ট তৈরি করা সম্ভব হবে না।               
২. একটা static ক্রিয়েট মেথড তৈরি করতে হবে যেটা কন্সট্রাক্টর হিসেবে কাজ করবে। এই ক্রিয়েট মেথড প্রাইভেট কন্সট্রাক্টরকে কল করে তার অবজেক্ট ক্রিয়েট করে।         

**ইমপ্লিমেন্টেশন**                                 
সিঙ্গেলটন প্যাটার্ন  বিভিন্নভাবে ইমপ্লিমেন্ট করা যায়। নিচে সেগুলোর বর্ণনা তুলে ধরা হলঃ  

* Eager initialization                  
Eager initialization এর ক্ষেত্রে সিঙ্গেলটন instance ক্লাস লোডিং এর সময় তৈরি হয়ে যায়। এটা তৈরি করা সবচেয়ে সহজ। কিন্তু সমস্যা হচ্ছে ক্লায়েন্ট যদি অ্যাপ্লিকেশন না ও ব্যবহার করে তারপর ও instance তৈরি হয়ে থাকবে।           
                
```eagar
public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

* Static block initialization                 
Static block initialization হল অনেকটা Eager initialization এর মত। এই ক্ষেত্রে ও instance তৈরি হয় ব্যবহারের পূর্বেই তফাৎ শুধু এইটার instance তৈরি হয় static ব্লকের ভেতরে।  এবং exception handling করা থাকবে।                          

```staticblock
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
```

* Lazy Initialization                   

* Thread Safe Singleton

* Bill Pugh Singleton Implementation

* Using Reflection to destroy Singleton Pattern

* Enum Singleton

* Serialization and Singleton


**সুবিধা - অসুবিধা**