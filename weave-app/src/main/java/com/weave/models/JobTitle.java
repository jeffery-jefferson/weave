package com.weave.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "job_titles")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @Column(name = "name", unique = true, nullable = false)
    String name;

    public JobTitle() {}

    public JobTitle(String name) { this.name = name; }

    public UUID getId() { return this.id; }
    public String getName() { return this.name; }
}
