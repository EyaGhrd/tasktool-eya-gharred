package com.eyaghrd.tasktool.part2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;
import lombok.Data;
@Entity
@Data
public class Task {
    @Id
    private String id;
    private String title;
    private String description;
    @ManyToOne
    private TaskCategory category;
    private TaskPriority priority;
    private String dueDate ;
}