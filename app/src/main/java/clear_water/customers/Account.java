package clear_water.customers;

public class Account {

    private String firstName;
    private String lastName;
    private String Address;
    private String phoneNumber;
    private double alkalineWater = 0.0;
    private double filteredWater = 0.0;

    public Account() {
    }

    public Account(String firstName, String lastName, String address, String phoneNumber
            , float alkalineWater, float filteredWater) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setAlkalineWater(alkalineWater);
        this.setFilteredWater(filteredWater);
    }

    public Account(String firstName, String lastName, String phoneNumber, float alkalineWater, float filteredWater) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setAlkalineWater(alkalineWater);
        this.setFilteredWater(filteredWater);
    }

    public Account(String firstName, String lastName, String phoneNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
    }

    public double getAlkalineWater() {
        return alkalineWater;
    }

    public void setAlkalineWater(float alkalineWater) {
        this.alkalineWater = alkalineWater;
    }

    public double getFilteredWater() {
        return filteredWater;
    }

    public void setFilteredWater(float filteredWater) {
        this.filteredWater = filteredWater;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
