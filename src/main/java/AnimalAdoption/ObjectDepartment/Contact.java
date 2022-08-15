
package AnimalAdoption.ObjectDepartment;

public class Contact {


    private String email;

    private String phone;

    private Address address;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Contact() {
    }

    /**
     * 
     * @param address
     * @param phone
     * @param email
     */
    public Contact(String email, String phone, Address address) {
        super();
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact withAddress(Address address) {
        this.address = address;
        return this;
    }

}
