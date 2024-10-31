package com.backend.sbbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document("userdetails")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDetails {
    @Id
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String dob;
    private String mobileNumber;
    private String email;

    public UserDetails(String id, String username, String password, String firstName, String lastName, String dob, String mobileNumber, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getId() {
      return this.id;
    }
    public void setId(String value) {
      this.id = value;
    }

    public String getUsername() {
      return this.username;
    }
    public void setUsername(String value) {
      this.username = value;
    }

    public String getPassword() {
      return this.password;
    }
    public void setPassword(String value) {
      this.password = value;
    }

    public String getFirstName() {
      return this.firstName;
    }
    public void setFirstName(String value) {
      this.firstName = value;
    }

    public String getLastName() {
      return this.lastName;
    }
    public void setLastName(String value) {
      this.lastName = value;
    }

    public String getDob() {
      return this.dob;
    }
    public void setDob(String value) {
      this.dob = value;
    }

    public String getMobileNumber() {
      return this.mobileNumber;
    }
    public void setMobileNumber(String value) {
      this.mobileNumber = value;
    }

    public String getEmail() {
      return this.email;
    }
    public void setEmail(String value) {
      this.email = value;
    }
}
