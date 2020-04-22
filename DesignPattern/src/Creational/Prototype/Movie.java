package Creational.Prototype;

/**
 * Created by Imran on 2/24/2020.
 */
public class Movie implements Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie Object.........");
        return (Movie)super.clone();
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
