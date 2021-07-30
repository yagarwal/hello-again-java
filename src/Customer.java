import java.util.Date;

public class Customer {
    private String name;
    private String contact;
    private Date lastLogin;
    private boolean isVerified;
    private Address[] addresses;
    private String[] emails;

    public Customer(String name, String contact, Date lastLogin, boolean isVerified, Address[] addresses, String[] emails) {
        this.name = name;
        this.contact = contact;
        this.lastLogin = lastLogin;
        this.isVerified = isVerified;
        this.addresses = addresses;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public String[] getEmails() {
        return emails;
    }
}
