package sample;

/**
 * Created by jamesyburr on 5/31/16.
 */
public class Contact {
    String name;
    String number;
    String email;

    public Contact(String name, String number, String email) {
        this.email = email;
        this.name = name;
        this.number = number;
    }

    public Contact(String text) {

    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
