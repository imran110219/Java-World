# টেস্ট ড্রাইভেন ডেভেলপমেন্ট (Test Driven Development)         
টেস্ট ড্রাইভেন ডেভেলপমেন্ট হল এক ধরনের সফটওয়্যার ডেভেলপমেন্ট প্রক্রিয়া যার প্রথমে লেখা হয় টেস্ট কেস তারপর ওই টেস্ট কেস পাস করে এমন কোড লিখতে হয় তারপর পর্যায়ক্রমে আবার ভিন্ন ভিন্ন টেস্ট কেস এবং কোড পরিবর্তন(refactor) করতে হয়। এভাবে আমরা সবগুলো টেস্ট কেস পাস করতে পারে এমন ফাংশন লিখে ফেলতে পারি। অর্থাৎ বিষয়টা এমন যে টেস্ট এবং কোডিং একই সাথে চলতে থাকবে। এইটা মূলত কোন ফ্রেমওয়ার্ক না, এইটা এক ধরনের ডেভেলপিং অ্যাপ্রোচ।          

**কেন দরকার টেস্ট ড্রাইভেন ডেভেলপমেন্ট**           
১. বাগ ফ্রি কোড    
২. সিম্পল কোড  
৩. 

**টেস্ট ড্রাইভেন ডেভেলপমেন্টের ধাপ**      
টেস্ট ড্রাইভেন ডেভেলপমেন্টের ধাপগুলো চক্রের মত চলতে থাকে।  টেস্ট ড্রাইভেন ডেভেলপমেন্ট সাধারণত তিনটি ধাপে হয়ে থাকেঃ          

**Red phase**            
এই ধাপে আমরা প্রথমে একটা টেস্ট কেস লিখব। তারপর আমরা আমাদের কোড লিখব ওই টেস্ট কেস পাস করার জন্য। তারপর কোডটা টেস্ট করব যদি ফেল হয় তাহলে আবার কোড করবো।                

**Green phase**        
এই ধাপে আমরা কোড করব যাতে টেস্ট কেস পাস করে। তারপর আমরা সবগুলো টেস্ট কেস টেস্ট করব।        

**Refactor phase**           
এই পর্যায়ে কোড আমাদেরকে রিফ্যাক্টর করতে হবে অর্থাৎ কোডের ভেতরে একই রকম কোড থাকলে সেটা রিমুভ করতে হবে। এমনভাবে রিমুভ করতে হবে যেন টেস্ট কেস গুলো ঠিকমত কাজ করে।       

এই ধাপ শেষে আবার প্রথম ধাপে ফিরে যাবে অর্থাৎ আর একটা নতুন টেস্ট কেস দিয়ে শুরু করতে হবে।        

উদাহরনঃ      
ধরা যাক, আমাদের একটা প্রোগ্রাম ডিজাইন করতে হবে যেখানে মানুষের বয়স ইনপুট দিলে সে কি বাচ্চা, মধ্যবয়সী, বৃদ্ধ সেটা আউটপুট দেখাবে। আমাদের হাতে অনেকগুলো টেস্ট কেস আছে সেগুলো এক এক করে আমরা যোগ করে প্রোগ্রাম লিখবো।     
টেস্ট কেস গুলো হলঃ         
| Input | Output |
| --- | --- |
| 1 | Children |
| 9 | Children |
| 10 | Adolescents |
| 19 | Adolescents |
| 20 | Adults |
| 45 | Adults |
| 46 | Middle age |
| 60 | Middle age |

আমরা প্রথমে দুইটা টেস্ট কেস বিবেচনা করব। আমাদের এই মেথড ইনপুট হিসেবে নিবে integer আর string আউটপুট দিবে। আমরা একটা খালি ফাংশন লিখব।              
```
public String checkState(int age){
	return "";
}
```

এবার আমরা প্রথম দুইটা ইনপুট পাস করে এমন কোড লিখব। অর্থাৎ আমাদের কোডে যেন 1 ইনপুট দিলে যেন Children আউটপুট দেয় এবং  9 ইনপুট দিলে যেন Children আউটপুট দেয়। তাহলে আমাদের কোডটা হবে এমন।          
```
public String checkState(int age){
	if(age == 1)
		return "Children";
	else if(age == 9)
		return "Children";
	return "Invalid Input";
}
```

*Unit Test*
```
public class TestCheckState {
    private final Checker checker = new Checker();
    @Test
    public void testCheckState() {
        assertEquals("Children",checker.checkState(1));
        assertEquals("Children",checker.checkState(9));
    }
}
```

এবার আমাদের কোডটা refactor করতে হবে। Duplicate কোড রিমুভ করতে হবে। আমাদের কোডে যদি কেউ  2 ইনপুট দেয় তাহলে আমাদের আবার সেম কোড লিখতে হবে। সুতরাং আমাদের ইনপুট ১ থেকে ৯ হলে Children আউটপুট দেখাতে হবে। তাহলে আমাদের কোড হবে এমন            
```
public String checkState(int age){
	if(age > 0 &&  age < 10)
		return "Children";
	return "Invalid Input";
}
```
এবার আমাদের আবার ইউনিট টেস্ট করতে হবে যদি আউটপুট ঠিকঠাক আসে তাহলে আমরা আবার প্রথম ধাপে ফিরে যাব অর্থাৎ নতুন দুইটা টেস্ট কেস দিয়ে শুরু করতে হবে।       
```
@Test
public void testCheckState() {
	assertEquals("Adolescents",checker.checkState(10));
	assertEquals("Adolescents",checker.checkState(19));
}
```

উপরোক্ত কোডে আমরা দেখতে পাচ্ছি দুইটা টেস্ট কেসই ফেল করছে। এই টেস্ট কেস পাস করার কোড লিখতে হবে আমাদের।         
```
public String checkState(int age){
	if(age > 0 &&  age < 10)
		return "Children";
	else if(age == 10)
		return "Adolescents";
	else if(age == 19)
		return "Adolescents";
	return "Invalid Input";
}
```

```
@Test
public void testCheckState() {
	assertEquals("Adolescents",checker.checkState(10));
	assertEquals("Adolescents",checker.checkState(19));
}
```

আমাদের কোডটা ঠিকমত কাজ করছে। এরপর আবার কোডটা refactor করতে হবে।

Children upto 9 years of age

Adolescents 10-19 years

Adults 20-45 years

Middle age 46-60 years

Old > 60


