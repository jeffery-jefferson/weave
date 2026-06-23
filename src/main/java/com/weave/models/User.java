package com.weave.models;

import java.util.List;
import java.util.UUID;
import java.util.Date;
import java.time.OffsetDateTime;

public class User {

    UUID id;
    String username;
    String firstName;
    String lastName;
    Date dateOfBirth;
    JobTitle title;
    Role role;
    User manager;
    List<User> employees;
    OffsetDateTime timeCreated;
    OffsetDateTime timeLastModified;

    public User() {}

    public UUID getId() {
        return this.id;
    }
    public String getUsername() {
        return this.username;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    public String getJobTitle() {
        return this.title.getName();
    }
    public Role getRole() { return this.role; }
    public User getManager() {
        return this.manager;
    }
    public List<User> getEmployees() { return this.employees; }
    public OffsetDateTime getTimeCreated() {
        return this.timeCreated;
    }
    public OffsetDateTime getTimeLastModified() {
        return this.timeLastModified;
    }
}
