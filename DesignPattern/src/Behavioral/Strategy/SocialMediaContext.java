package Behavioral.Strategy;

/**
 * Created by Imran on 3/4/2020.
 */
public class SocialMediaContext {
    ISocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }

    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}
