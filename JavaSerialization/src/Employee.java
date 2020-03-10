/**
 * Created by Sadman on 3/10/2020.
 */
public class Employee implements java.io.Serializable {
    public int SSN;
    public String name;
    public String address;
    public int number;

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
