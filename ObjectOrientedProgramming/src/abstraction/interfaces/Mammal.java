package abstraction.interfaces;

import abstraction.interfaces.Animal;

/**
 * Created by Sadman on 2/19/2020.
 */
public interface Mammal extends Animal {
    public boolean isCarnivore();
    public boolean isHerbivore();
    public boolean isOmnivore();
}
