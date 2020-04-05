# জাভা মাল্টিথ্রেডিং বিষয়বস্তু

### ১. থ্রেড 

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



### ২. Volatile – Basic Thread Communication

### ৩. Synchronized

### ৪. Lock Objects

### ৫. Thread Pools

### ৬. Countdown Latches

### ৭. Producer-Consumer

### ৮. Wait and Notify

### ৯. Low-Level Producer-Consumer

### ১০. Re-entrant Locks

### ১১. Deadlock

### ১২. Semaphores

### ১৩. Callable and Future

### ১৪. Interrupting Threads