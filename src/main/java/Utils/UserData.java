// UserData.java
package Utils;

import java.util.UUID;

public class UserData {

    private String firstName;
    private String lastName;
    private String email;
    private String Company;
    private String Address1;
    private String City;
    private String PostCode;


    public UserData(String firstName, String lastName, String email, String Company, String Address1, String City) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.Company = Company;
        this.Address1 = Address1;
        this.City = City;
        this.PostCode=PostCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Method to generate a unique email
    public static String generateUniqueEmail() {
        return "user_" + UUID.randomUUID().toString() + "@example.com";
    }

    public String getCompany() {
        return Company;
    }

    public String getAddress1() {
        return Address1;
    }

    public String getCity() {
        return City;
    }

    public String getPostCode() {
        return PostCode;
    }
}

