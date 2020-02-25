package Creational.Prototype;

/**
 * Created by Imran on 2/24/2020.
 */
public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
