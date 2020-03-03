package Behavioral.Strategy;

/**
 * Created by Imran on 3/4/2020.
 */
public class OrkutStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Orkut [not possible though :)]");
    }
}
