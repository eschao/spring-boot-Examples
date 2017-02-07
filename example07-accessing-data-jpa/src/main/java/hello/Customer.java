package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by chao on 07/02/2017.
 */
// @Entity indicates the Customer class is a JPA entity
// No @Table annotation, which means the table is named Customer
@Entity
public class Customer {

    // @Id is to let JPA recognize it as the object's ID
    // @GeneratedValue indicates the ID should be generated automatically
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    // No annotations for these two properties, which means they will be mapped
    // to columns that share the same name as the properties themselves
    private String firstName;
    private String lastName;

    // It is only exists for the sake of JPA
    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
