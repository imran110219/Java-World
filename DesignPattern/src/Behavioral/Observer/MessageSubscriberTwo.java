package Behavioral.Observer;

/**
 * Created by Sadman on 3/2/2020.
 */
public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}