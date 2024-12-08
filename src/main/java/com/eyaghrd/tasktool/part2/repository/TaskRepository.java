package com.eyaghrd.tasktool.part2.repository;

import com.eyaghrd.tasktool.part2.entity.Task;
import com.eyaghrd.tasktool.part2.entity.TaskCategory;
import com.eyaghrd.tasktool.part2.entity.TaskPriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTaskByTitle(String title);
    Task findByTaskById(Long id);
    List<Task> findTasks();
    Task addTask(Task task);
    Task updateTask(Task task);
    boolean deleteTask(Task task);
    List<Task> findAllByTaskPriority(TaskPriority priority);
    List<Task> findTaskByCategory(TaskCategory category);
}
