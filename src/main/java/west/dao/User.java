package west.dao;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class User {

    private String id;
    @NotNull(message = "First name is mandatory")
    @Size(min = 1, message = "First name is mandatory")
    private String firstName;
    @NotNull(message = "Last name is mandatory")
    @Size(min = 1, message = "Last name is mandatory")
    private String lastName;
    @NotNull
    @Email
    private String email;
    @NotNull
    private Date dob;

    public User(String firstName, String lastName, String email, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dob = new Date();
    }

    public String getId() {
        return id;
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

    public String getDob() {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        return df.format(this.dob);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setDob(String dob) {
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
        try {
            this.dob = format.parse(dob);
        } catch (ParseException e) {
            this.dob = new Date();
        }
    }
}
