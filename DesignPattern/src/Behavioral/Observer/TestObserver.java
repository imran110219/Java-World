package Behavioral.Observer;

/**
 * Created by Sadman on 3/2/2020.
 */
public class TestObserver {
    public static void main(String[] args)
    {
        SubscriberOne s1 = new SubscriberOne();
        SubscriberTwo s2 = new SubscriberTwo();
        SubscriberThree s3 = new SubscriberThree();

        Publisher p = new Publisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
