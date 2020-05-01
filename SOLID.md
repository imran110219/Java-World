# সলিড প্রিন্সিপাল (SOLID Principle)                  
সলিড প্রিন্সিপাল হল একটি বিশেষ ধরনের কোডিং স্ট্যান্ডার্ড এটা প্রতিটা ডেভ্লপারের জানা থাকা উচিত সুগঠিতভাবে কোন সফটওয়ার ডিজাইন করার জন্য। এটা ফলো করে আমরা ত্রুটিপূর্ণ কোডিং প্রাকটিস থেকে মুক্ত হতে পারি। সাধারণভাবে আমরা কোন সফটওয়্যার বানানোর ক্ষেত্রে যদি কোন স্ট্যান্ডার্ড ফলো না করি তাহলে প্রথমে কোন সমস্যা না মনে হলে ও এটার পরিধি যখন বাড়বে তখন জটিল আকার ধারন করবে। এবং পরবর্তীতে প্রোজেক্ট এক্সটেন্ড করতে গেলে সমস্যার সম্মুখীন হতে হয়। কিন্তু সলিড ফলো করে কোড করলে এটা অন্য ডেভ্লপারের বুঝতে সুবিধা হয় এবং একটা লজিকাল স্ট্রাকচার দাঁড়িয়ে যায়।                          
সলিড প্রিন্সিপালের সর্বমোট ৫ টা প্রিন্সিপাল। SOLID এর পাচটা অক্ষরকে দিয়ে প্রতিটার নাম শুরু হয়। 
* S — Single Responsibility Principle            
* O — Open-Closed Principle                
* L — Liskov Substitution Principle                  
* I — Interface Segregation Principle               
* D — Dependency Inversion Principle              

**Single Responsibility Principle**        
> A class should have one, and only one, reason to change.    

সিঙ্গেল রেস্পন্সিবিলিটি প্রিন্সিপাল বলতে বুঝায় একটি ক্লাস সবসময় এক ধরনের কাজ করবে এবং ওই ক্লাসটা যদি পরিবর্তন করা হয় তাহলে তাহলে সেটা একটি কারনেই পরিবর্তন করা যাবে। এইটা লক্ষ্য রেখে যদি কোডিং করা হয় তাহলে কিছু সুবিধা আছে। সেগুলো হলঃ                                           
১. একটা ক্লাসের একটা রেস্পন্সিবিলিটি থাকার জন্য সেটার টেস্ট সহজে করা যায়।                  
২. একটি ক্লাস অন্য ক্লাসের উপর কম নির্ভর করে অর্থাৎ এইটা lower coupling হয়।                         
৩. কোডিং প্যাটার্ন খুব গোছানো হয় এবং খুব সহজেই কোন মেথড খুজে পাওয়া যায়।                                  

```
public class Person {
    private String name;
    private String email;
	private String phone;
 
    //constructor, getters and setters
 
    // methods that directly relate to the person properties
	
    public boolean sendMail(String messages, String email){
        return sendMail(messages, email);
    }
 
    public boolean sendPhoneMessages(String messages, String email){
        return sendPhoneMessages(messages, email);
    }
}
```

উপরের কোড থেকে আমরা দেখতে পাই Person ক্লাসের ভিতর এই ক্লাসের ভ্যারিয়েবল গুলো আছে এবং একই সাথে এই ক্লাসের সাথে সম্পর্কযুক্ত মেথড আছে। এই ক্ষেত্রে সিঙ্গেল রেস্পন্সিবিলিটি প্রিন্সিপাল ফলো করা হয় নি। কারন এই ক্লাসের ভেতর দুই ধরনের জিনিস আছে একটা হল ডাটা অবজেক্ট আরেকটা হল কাওকে মেসেজ পাঠানোর মেথড। এখন আমরা সিঙ্গেল রেস্পন্সিবিলিটি প্রিন্সিপাল অনুসরন করে এই ক্লাস ডিজাইন করবো।            

```
public class Person {
    private String name;
    private String email;
	private String phone;
 
    //constructor, getters and setters
}
```

```
public class SendMessages {
	
    public boolean sendMail(String messages, String email){
        return sendMail(messages, email);
    }
 
    public boolean sendPhoneMessages(String messages, String email){
        return sendPhoneMessages(messages, email);
    }
}
```

**Open-Closed Principle**          
> Objects or entities should be open for extension, but closed for modification.           
কোন প্রোজেক্টের যে ক্লাস গুলো তৈরি করা হয়েছে আগেই সেইগুলো extend করা যাবে কিন্তু এটাকে modify করা যাবে না। যদি ওই ক্লাসের bugfix করার কোন ব্যাপার থাকে তাহলে অন্য কথা। যদি কোন ক্লাস পরিবর্তন করি তাহলে এটা অন্যান্য ক্লাসের উপর প্রভাব পড়তে পারে। এজন্য আমাদের যদি কোন ক্লাস দরকার হয় এবং এমন কিছু মেথড বা ভ্যারিয়েবল দরকার হয় যেটা সেই ক্লাসে নাই। সেক্ষেত্রে আমরা উক্ত ক্লাসটিকে extend করে নতুন ক্লাস তৈরি করে নেব।                                            
উদাহরনঃ ধরি আমাদের Person ক্লাস আছে এখন আমাদের Student ক্লাস দরকার যার রোল নাম্বার এবং ডিপার্টমেন্ট থাকবে। সেইক্ষেত্রে আমরা Person ক্লাসকে পরিবর্তন করবো না। একে আমরা extend করবো।                  

```
public class Person {
    private String name;
    private String email;
	private String phone;
 
    //constructor, getters and setters
}
```

```
public class Student extends Person {
    private String rollNumber;
    private String department;
 
    //constructor, getters and setters
}
```

**Liskov Substitution Principle**           
> Derived classes must be substitutable for their base classes.              


**Interface Segregation Principle**           

**Dependency Inversion Principle**            