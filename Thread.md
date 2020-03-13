# Java Thread

### Java Thread কি?
থ্রেড হল একটা প্রক্রিয়া যা সহজে execute হয়। জাভার নিজস্ব support আছে multithreading programming এর জন্য। multithreading program একই সাথে দুই বা ততোধিক process চালাতে পারে। সহজভাবে যদি বলি আপনি যদি 
একই সাথে গান শোনা এবং বই পড়া চালিয়ে যাচ্ছেন বিষয় টা অনেকটা সেই রকম। 

### Java Thread Lifecycle (জীবনচক্র)
জাভাতে Thread এর একটি নির্দিষ্ট জীবন চক্র আছে। Thread এর জীবন চক্র ৫ টা ধাপে সম্পন্ন হয়ে থাকে।
1. **New** : যখন কোন Thread তৈরী করা হয় তখন্ এই পর্যায়ে থাকে। 
2. **Runnable** : Thread যখন run() হওয়ার জন্য প্রস্তুত থাকে।
3. **Running** : এইটা হল Thread এর চলমান অবস্থা।
4. **Non-Runnable (Blocked)** : যখন Thread কে চলমান অবস্থায় থামিয়ে দেওয়া হয়।
5. **Terminated** : এইটা হল যখন ফাইনালি Thread কে বন্ধ করে দেওয়া হয়।


### Java Thread তৈরির উপায়
Thread মুলত দুইভাবে তৈরী করা যায়ঃ
1. Runnable Interface কে  implement করে
2. Thread class কে extend করে 

### Java Thread built in methods
জাভাতে কিছু নিজস্ব method আছে যে গুলো Thread এর implementation এর জন্য ব্যবহার করা যায়ঃ
*getName	Obtain thread’s name
*getPriority	Obtain thread’s priority
*isAlive	Determine if a thread is still running
*join	Wait for a thread to terminate
*run	Entry point for the thread
*sleep	Suspend a thread for a period of time
*start	
*Start a thread by calling its run method