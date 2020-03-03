package Behavioral.Strategy;

/**
 * Created by Imran on 3/4/2020.
 */
public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}