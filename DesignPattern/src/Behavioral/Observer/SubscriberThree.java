package Behavioral.Observer;

/**
 * Created by Sadman on 3/2/2020.
 */
public class SubscriberThree implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}