package encapsulation;

/**
 * Created by Sadman on 2/18/2020.
 */
public class Citizen {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18)
            this.age = age;
    }

    public static void main(String[] args){
        Citizen citizen = new Citizen();
        citizen.setName("Sadman");
        citizen.setAddress("Dhaka");
        citizen.setAge(17);
        System.out.println(citizen.getName() + " is " + citizen.getAge() + " years old and lives in " + citizen.getAddress());
    }
}
