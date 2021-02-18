package model;

import annotations.Web;
import java.io.Serializable;

/**
 *
 * @author NisfaYasam
 */
@Web
public class User implements Serializable {

    private String name;
    private String password;
    private String email;
    private String salutation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

}
