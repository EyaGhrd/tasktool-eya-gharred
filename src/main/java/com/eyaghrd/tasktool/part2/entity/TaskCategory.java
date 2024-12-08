package com.eyaghrd.tasktool.part2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TaskCategory {
    @Id
    private Long id;
    private String name;
}
