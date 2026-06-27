package com.weave.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;
import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @Column(name = "username", unique = true, nullable = false)
    String username;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "date_of_birth")
    Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "job_title_id")
    JobTitle title;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    User manager;

    @OneToMany(mappedBy = "manager")
    HashSet<User> employees;

    @Column(name = "time_created", updatable = false)
    OffsetDateTime timeCreated;

    @Column(name = "time_last_modified")
    OffsetDateTime timeLastModified;

    public User() {}

    public UUID getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getFullName() { return this.firstName + " " + this.lastName; }
    public Date getDateOfBirth() { return this.dateOfBirth; }
    public String getJobTitle() { return this.title.getName(); }
    public Role getRole() { return this.role; }
    public User getManager() { return this.manager; }
    public HashSet<User> getEmployees() { return this.employees; }
    public OffsetDateTime getTimeCreated() { return this.timeCreated; }
    public OffsetDateTime getTimeLastModified() { return this.timeLastModified; }
}
