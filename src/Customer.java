public class Customer {
    private String customerID;
    private String Name;
    private String phoneNumber;

  /*  public Customer(String customerID, String Name, String phoneNumber) {
        this.customerID = customerID;
        this.Name = Name;
        this.phoneNumber = phoneNumber;
    }*/

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String firstName) {
        this.Name = firstName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
