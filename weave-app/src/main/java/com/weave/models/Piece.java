package com.weave.models;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "pieces")
public class Piece {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "completion_due_date")
    Date completionDueDate;

    @Column(name = "time_created", updatable = false)
    OffsetDateTime timeCreated;

    @Column(name = "time_last_modified")
    OffsetDateTime timeLastModified;

    public Piece() {}

    public UUID getId() { return this.id; }
    public String getName() { return this.name; }
    public Date getCompletionDueDate() { return this.completionDueDate; }
    public OffsetDateTime getTimeCreated() { return this.timeCreated; }
    public OffsetDateTime getTimeLastModified() { return this.timeLastModified; }
}
