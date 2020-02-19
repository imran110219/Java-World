package abstraction.interfaces;

/**
 * Created by Imran on 2/19/2020.
 */
class Man implements Mammal{

    @Override
    public void getLatinName() {
        System.out.println("Latin name is Homo Sapiens.");
    }

    @Override
    public void getCommonName() {
        System.out.println("Human");
    }

    @Override
    public void getWeight() {
        System.out.println("50-80 kg");
    }

    @Override
    public boolean isHousePet() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return false;
    }

    @Override
    public boolean isHerbivore() {
        return false;
    }

    @Override
    public boolean isOmnivore() {
        return true;
    }
}

class Aquaman implements Mammal, Fish{

    @Override
    public void getLatinName() {

    }

    @Override
    public void getCommonName() {

    }

    @Override
    public void getWeight() {

    }

    @Override
    public boolean isHousePet() {
        return false;
    }

    @Override
    public boolean isCarnivore() {
        return false;
    }

    @Override
    public boolean isHerbivore() {
        return false;
    }

    @Override
    public boolean isOmnivore() {
        return false;
    }

    @Override
    public void underwaterSwimming() {
        System.out.println("Swimming under the water.");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Man man = new Man();
        man.getLatinName();

        Aquaman aquaman = new Aquaman();
        aquaman.underwaterSwimming();
    }
}
