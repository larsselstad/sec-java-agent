package no.scelto.secjavaagent;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class FormInput {
    private String name;
    private String phonenumber;
    private String email;

    public FormInput() {
        // Default constructor
    }

    public FormInput(String name, String phonenumber, String email) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}