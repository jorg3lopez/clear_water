package clear_water.customers;

public class Account {

    private String firstName;
    private String lastName;
    private String Address;
    private String phoneNumber;
    private double alkaline = 0.0;
    private double filtered = 0.0;

    public Account() {
    }

    public Account(String firstName, String lastName, String address, String phoneNumber
            , float alkaline, float filtered) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setAlkaline(alkaline);
        this.setFiltered(filtered);
    }

    public Account(String firstName, String lastName, String phoneNumber, float alkaline, float filtered) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
        this.setAlkaline(alkaline);
        this.setFiltered(filtered);
    }

    public Account(String firstName, String lastName, String phoneNumber) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNumber(phoneNumber);
    }

    public double getAlkaline() {
        return alkaline;
    }

    public void setAlkaline(float alkaline) {
        this.alkaline = alkaline;
    }

    public double getFiltered() {
        return filtered;
    }

    public void setFiltered(float filtered) {
        this.filtered = filtered;
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
