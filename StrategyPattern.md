# স্ট্রাটেজি প্যাটার্ন (Strategy Pattern)               
স্ট্রাটেজি প্যাটার্ন হল বিহ্যাভিওরাল ডিজাইন প্যাটার্ন যার মাধ্যমে অ্যালগরিদমের সমষ্টি আলাদা আলদা ক্লাসে রাখা হয় এবং প্রয়োজনে অবজেক্টের ক্লাস পরিবর্তন করা যায়।                         
  
**উদাহরন**                    
১. javax.servlet.http.HttpServlet স্ট্রাটেজি প্যাটার্ন ফলো করে তৈরি করা।      

**সমস্যা**         
আমাদের যদি এমন কোন সিস্টেম লাগবে যার দ্বারা আমরা বিভিন্ন সামাজিক যোগাযোগ মাধ্যমে কোন ব্যাক্তির সাথে কানেক্ট হতে পারবো। সেই ক্ষেত্রে আমাদের প্রতিটা সামাজিক মাধ্যমের জন্য আলাদা আলাদা ক্লাস বানানো লাগবে এবং একটা ক্লাস লাগবে সেটা যেন কোন ব্যাক্তির নাম উল্লেখ করলে যেন তার সাথে কানেক্ট হয়ে যায়। তখন যদি আমাদের কোন ক্লাস তার গঠন পরিবর্তন করে ক্লায়েন্টকে তার কোডে ও পরিবর্তন করতে হয়।       
     
**সমাধান**                                     


**ইমপ্লিমেন্টেশন**               
```
public interface ISocialMediaStrategy {
    public void connectTo(String friendName);
}
```

```
public class SocialMediaContext {
    ISocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }

    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}
```

```
public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}
```

```
public class TwitterStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}
```

```
public class TestStrategy {
    public static void main(String[] args) {

        SocialMediaContext context = new SocialMediaContext();

        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Facebook Name");

        System.out.println("====================");

        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Twitter Name");
    }
}
```

**সুবিধা - অসুবিধা**             