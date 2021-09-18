package day47_constructors;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "TURKIYE";

    public Address() {
        System.out.println("Address constructor");
        street = "Yesilkoy";
        city = "Durumcu";
        state = "BABA";
        zipCode = "3434";

    }


    public Address(String street,String city, String state, String zipCode){
        this.street = street; //direct assigning
        setStreet(street); // we can use it with conditions
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }



    @Override
    public String toString() {
        return street + ", " + city + ", " + zipCode ;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50 ) {
            System.out.println("Error");
        }else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
