# হাইবারনেট

* ভূমিকা
* ও আর এম
* হাইবারনেট
* আর্কিটেকচার 
* সেট আপ
* কনফিগারেশন
* সেশন
* পারসিসটেন্ট ক্লাস
* ম্যাপিং ফাইলস 
* ম্যাপিং টাইপস
* উদাহরণ
* ও/আর ম্যাপিং 
* অ্যানোটেশন 
* কুয়েরি 
* ক্রাইটেরিয়া কুয়েরি 
* নেটিভ এস কিউ এল 
* ক্যাশিং 
* ব্যাচ প্রসেসিং 
* ইন্টারসেপ্টর 


**ভূমিকা**

হাইবারনেট ভালভাবে জানার জন্য জেডিবিস, রিলেশনাল ডাটাবেজ এবং এস কিউ এল সম্পর্কে জানা থাকতে হবে। 

**ও আর এম**

ও আর এম(ORM) হল অবজেক্ট রিলেশনাল মডেল। এটা হল এমন একটা টেকনিক যাতে প্রোগ্রামিং ল্যাঙ্গুয়েজের (C#, java) অবজেক্ট আর রিলেশনাল ডাটাবেজের টেবিলের মধ্যে ডাটা সহজে আদান প্রদান করা যায়।   

জাভার অনেকগুলো ও আর এম ফ্রেমওয়ার্ক আছে। কয়েকটার নাম এখানে উল্লেখ করা হলঃ
* Enterprise JavaBeans Entity Beans
* Java Data Objects
* Castor
* TopLink
* Spring DAO
* Hibernate

**হাইবারনেট**

হাইবারনেট হল জাভার একটা ও আর এম সল্যুশন। এটি হল ওপেন সোর্স পারসিস্টেন্ট ফ্রেম ওয়ার্ক। হাইবারনেট জাভা ক্লাস আর ডাটাবেজ টেবিলের মধ্যে ম্যাপিং করে এক্স এম এল ফাইল অথবা প্রপারটিজ ফাইল ব্যবহারের মাধ্যমে এবং কোন কোড লেখা ছাড়াই। 


**আর্কিটেকচার**

হাইবারনেট হল একাধিক স্তর বিশিষ্ট আর্কিটেকচার এবং এটি নিজে ও অনেক ধরনের এপিআই ব্যবহার করে। যেটা খুব সহজে আমরা ব্যবহার করতে পারি হাইবারনেটের ব্যবহৃত এপিআই সম্পর্কে জ্ঞান থাকা ছাড়াই। জেডিবিস, জাভা ট্রানশাকশন এপিআই(JTA), জাভা নেমিং এন্ড ডিরেক্টরি ইন্টারফেস(JNDI) এই গুলো হাইবারনেটে ব্যবহৃত কিছু এপিআই। জেডিবিসি রিলেশনাল ডাটাবেজের সাথে কিছু প্রাথমিক লেভেলের সার্ভিস হাইবারনেট কে সরবারাহ করে থাকে। জেটিএ আর জেএনডিআই হাইবারনেটকে j2ee এর সাথে সমন্বয় সাধন করে। 

হাইবারনেট ব্যবহার করা হয় এমন কিছু ক্লাস অবজেক্ট সেগুলো নিয়ে বর্ণনা করা হলঃ

* Configuration Object
* SessionFactory Object
* Session Object
* Transaction Object
* Query Object
* Criteria Object

**কনফিগারেশন**

হাইবারনেটের কনফিগারেশনের জন্য তিনভাবে কাজটি করা যায়। সেগুলো হলঃ

১. এক্স এম এল ফাইল ব্যবহার করে  
২. প্রোপার্টিজ ফাইল ব্যবহার করে 
৩. জাভা ফাইল ব্যবহার করে 