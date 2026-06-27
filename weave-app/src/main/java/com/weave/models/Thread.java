package com.weave.models;

import jakarta.persistence.*;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

@Entity
@Table(name = "threads")
public class Thread {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    UUID id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "description", columnDefinition = "TEXT")
    String description;

    @Column(name = "completion_due_date")
    Date completionDueDate;

    @ManyToMany
    @JoinTable(
        name = "thread_parents",
        joinColumns = @JoinColumn(name = "thread_id"),
        inverseJoinColumns = @JoinColumn(name = "parent_id")
    )
    HashSet<Thread> parentThreads;

    @ManyToMany(mappedBy = "parentThreads")
    HashSet<Thread> subThreads;

    @ManyToOne
    @JoinColumn(name = "assigned_to_id")
    User assignedTo;

    @ManyToOne
    @JoinColumn(name = "created_by_id", updatable = false)
    User createdBy;

    @Column(name = "time_created", updatable = false)
    OffsetDateTime timeCreated;

    @Column(name = "time_last_modified")
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
    public HashSet<Thread> getParentThreads() { return this.parentThreads; }
    public Thread addParentThread(Thread parent) {
        this.parentThreads.add(parent);
        return this;
    }
    public Thread removeParentThread(Thread parent) {
        this.parentThreads.remove(parent);
        return this;
    }
    public HashSet<Thread> getSubThreads() { return this.subThreads; }
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
