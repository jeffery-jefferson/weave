package com.weave.models;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

public class Piece {

    UUID id;
    String name;
    Date completionDueDate;
    OffsetDateTime timeCreated;
    OffsetDateTime timeLastModified;

    public Piece() {}

    public UUID getId() { return this.id; }
    public String getName() { return this.name; }
    public Date getCompletionDueDate() { return this.completionDueDate; }
    public OffsetDateTime getTimeCreated() { return this.timeCreated; }
    public OffsetDateTime getTimeLastModified() { return this.timeLastModified; }
}
