package com.weave.models;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.Date;

public class Thread {

    UUID id;
    String title;
    String description;
    Date completionDueDate;
    List<Thread> parentThreads;
    List<Thread> subThreads;
    User assignedTo;
    User createdBy;
    OffsetDateTime timeCreated;
    OffsetDateTime timeLastModified;

    public Thread() {}

    public UUID getId() { return this.id; }
    public String getTitle() { return this.title; }
    public String getDescription() { return this.description; }
    public Date getCompletionDueDate() { return this.completionDueDate; }
    public Thread setCompletionDueDate(Date dueDate) {
        this.completionDueDate = dueDate;
        return this;
    }
    public List<Thread> getParentThreads() { return this.parentThreads; }
    public Thread addParentThread(Thread parent) {
        this.parentThreads.add(parent);
        return this;
    }
    public Thread removeParentThread(Thread parent) {
        this.parentThreads.remove(parent);
        return this;
    }
    public List<Thread> getSubThreads() { return this.subThreads; }
    public Thread addSubThread(Thread subThread) {
        this.subThreads.add(subThread);
        return this;
    }
    public Thread removeSubThread(Thread subThread) {
        this.subThreads.remove(subThread);
        return this;
    }
    public OffsetDateTime getTimeCreated() { return this.timeCreated; }
    public OffsetDateTime getTimeLastModified() { return this.timeLastModified; }
} 
