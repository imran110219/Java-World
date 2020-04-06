# জাভা মাল্টিথ্রেডিং বিষয়বস্তু

### ১. মাল্টিথ্রেডিং উদাহরণ  

১. এখানে থ্রেড ক্লাস এক্সটেন্ড করে মাল্টিথ্রেডিং ডিজাইন করা হয়েছে। 

```Thread 
class Runner extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationExtends {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();
    }
}
```             

২. এখানে runnable ইন্টারফেস ইমপ্লিমেন্ট করে মাল্টিথ্রেডিং ডিজাইন করা হয়েছে। 

```Runnable       
class Runner implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        thread1.start();
        thread2.start();
    }
}
```      

৩. এখানে ল্যামডা ফাংশন ব্যবহার করে মাল্টিথ্রেডিং ডিজাইন করা হয়েছে। 

```annonymous      
public class Application {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Runnable runnerLambda = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        new Thread(runnerLambda).start();
    }
}
```              



### ২. ভোলাটাইল কি ওয়ার্ড (volatile)      

volatile কি ওয়ার্ড ব্যবহার করা হয় অবজেক্ট আর প্রিমিটিভ টাইপের জন্য। এটা ব্যবহার করা হয় বিভিন্ন থ্রেডে variable এর মান আপডেট করার ক্ষেত্রে। ক্লাসকে থ্রেড সেফ করার জন্য ও এটি ব্যবহার করা হয়। থ্রেড সেফ বলতে বোঝায় একাধিক থ্রেড একটা ক্লাসের মেথড এবং প্যারামিটার একই সময়ে এক্সেস করতে পারে।  volatile কি ওয়ার্ডের ভ্যালু লোকাল cache এ সেভ করে না, এটা সেভ হয় সরাসরি main memory তে। 

### ৩. সিঙ্ক্রোনাইজ (Synchronized)          



### ৪. লক অবজেক্ট (Lock Objects) 

### ৫. থ্রেড পুল (Thread Pools)          

### ৬. কাউন্টডাউন ল্যাচেস (Countdown Latches)           

### ৭. Producer-Consumer

### ৮. Wait and Notify

### ৯. Low-Level Producer-Consumer

### ১০. Re-entrant Locks

### ১১. Deadlock

### ১২. Semaphores

### ১৩. Callable and Future

### ১৪. Interrupting Threads