# এডাপ্টার প্যাটার্ন (Adapter Pattern)   
এডাপ্টার প্যাটার্ন হল স্ট্রাকচারাল ডিজাইন প্যাটার্ন যা এমন একটা ডিজাইন প্যাটার্ন যেটা একটা অবজেক্টকে ভিন্ন ভিন্ন ইন্টারফেসের সাথে কাজ করতে পারে। অর্থাৎ একটা অবজেক্ট যখন বিভিন্ন ইন্টারফেসের সাথে এডাপ্ট বা মানিয়ে নেয়।                

**উদাহরন**                    
১. java.util.Arrays#asList() এডাপ্টার প্যাটার্ন ফলো করে তৈরি করা।                                     
২. java.util.Collections#list() ও একইভাবে তৈরি।

**সমস্যা**         
     
**সমাধান**                                     

**ইমপ্লিমেন্টেশন**                
```
public class Volt {
    private int volts;

    public Volt(int v){
        this.volts=v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
```

```
public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
```

```
public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
```

**সুবিধা - অসুবিধা**              